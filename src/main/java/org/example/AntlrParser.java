package org.example;

import org.example.MySqlGeneratorBaseVisitor;
import org.example.MySqlGeneratorParser;
import lombok.extern.slf4j.Slf4j;
import org.example.common.AggregateFunctionMapper;

import java.util.stream.Collectors;

/*
  .accept(this) na nodzie przechodzi nam do odpowiedniej metody. przydatne z children.findFirst()
 */

@Slf4j
public class AntlrParser extends MySqlGeneratorBaseVisitor<String> {

//    ArrayList<String> tableNames = new ArrayList<>(); w przyszlosci, gdy bedzie można dodawać zagnieżdżenia
    StringBuilder aggregateOutput = new StringBuilder();
    String tableName;

    @Override
    public String visitQuery(MySqlGeneratorParser.QueryContext ctx) {
        StringBuilder query = new StringBuilder();
        log.debug("{}", ctx.getText());
        tableName = ctx.TABLENAME().getText();
        log.debug("tableName: {}", tableName);

        query.append("(");
//        query.append(ctx.statement().accept(this));
        query.append(visitStatement(ctx.statement()));
        query.append(")");

        return query.toString();
    }

    @Override
    public String visitStatement(MySqlGeneratorParser.StatementContext ctx) {
        return ctx.children.getFirst().accept(this);
    }

    @Override
    public String visitFindStatement(MySqlGeneratorParser.FindStatementContext ctx) {
        StringBuilder query = new StringBuilder();
        log.debug("{}", ctx.getText());
        query.append("SELECT ");
        query.append(ctx.selectItem().accept(this));
        query.append("FROM ");
        query.append(tableName);
        query.append(" ");
        query.append(ctx.findAdditionalClausules().accept(this));


        return query.toString();
    }

    //todo
    @Override
    public String visitDeleteStatement(MySqlGeneratorParser.DeleteStatementContext ctx) {
        return super.visitDeleteStatement(ctx);
    }

    @Override
    public String visitSelectItem(MySqlGeneratorParser.SelectItemContext ctx) {
        if(ctx.ALL() != null) {
            return "* ";
        } else {
            return ctx.children.stream().filter(x -> !x.getText().equals("All"))
                    .map(x -> x.accept(this))
                    .collect(Collectors.joining(", ")) + " ";
        }
    }

    @Override
    public String visitAggregateOrColumnOrSubQuery(MySqlGeneratorParser.AggregateOrColumnOrSubQueryContext ctx) {
        if(ctx.COLUMNNAME() != null) {
            return tableName + "." + ctx.COLUMNNAME().getText();
        } else {
            return ctx.aggregateFunction().accept(this);
        }
    }

    @Override
    public String visitAggregateFunction(MySqlGeneratorParser.AggregateFunctionContext ctx) {
        if(ctx.ALL() != null) {
            return "COUNT(*)";
        } else {
            log.debug(ctx.aggregationType().children.getFirst().getText());

            var aggregate = AggregateFunctionMapper.getSqlStart(ctx.aggregationType().children.getFirst().getText());

            return aggregate + tableName + "." + ctx.COLUMNNAME() + ")";
        }
    }

    @Override
    public String visitFindAdditionalClausules(MySqlGeneratorParser.FindAdditionalClausulesContext ctx) {
        if(ctx.children == null) {return "";}
        return ctx.children.stream().map(x -> x.accept(this)).collect(Collectors.joining(" "));
    }

    @Override
    public String visitAggregationType(MySqlGeneratorParser.AggregationTypeContext ctx) {
        return super.visitAggregationType(ctx);
    }

    @Override
    public String visitWhereClause(MySqlGeneratorParser.WhereClauseContext ctx) {
        StringBuilder query = new StringBuilder();
        query.append("WHERE (");
        query.append(ctx.condition().accept(this));
        query.append(") ");
        return query.toString();
    }

    @Override
    public String visitCondition(MySqlGeneratorParser.ConditionContext ctx) {
        log.debug(ctx.getText());
        log.debug("weszlismy do condition");
        StringBuilder query = new StringBuilder();
        if(ctx.LPAREN() != null) {
            query.append("(");
            if(ctx.variableexpression(0) != null) {
                query.append(ctx.variableexpression(0).accept(this));
            } else {
                query.append(ctx.condition().accept(this));
            }
            query.append(") ");
        }

        if(ctx.AND() != null || ctx.OR() != null) {
            if(ctx.AND() != null) {
                query.append("AND ");
            } else {
                query.append("OR ");
            }

            if(ctx.variableexpression(1) != null) {
                ctx.variableexpression(1).accept(this);
            } else {
                query.append(ctx.condition().accept(this));
            }
        }

        query.append(genIfNotNull(ctx.RPAREN(), ")"));
        return query.toString();
    }

    @Override
    public String visitVariableexpression(MySqlGeneratorParser.VariableexpressionContext ctx) {
        return ctx.COLUMNNAME().getText() + " " + ctx.expression().accept(this);
    }

    @Override
    public String visitExpression(MySqlGeneratorParser.ExpressionContext ctx) {
        log.debug(ctx.getText());
        log.debug("weszlismy do Expression");
        log.debug("liczba operatorow: {}", ctx.operator().size());

        StringBuilder query = new StringBuilder();
        if(ctx.LPAREN() != null) {
            log.debug("weszlismy do nawiasow");
            query.append("(");
            if(ctx.operator(0) != null) {
                log.debug("Wewnatrz tego dla 0: {}", ctx.operator(0).accept(this));
                query.append(ctx.operator(0).accept(this));
            } else {
                query.append(ctx.expression().accept(this));
            }
            query.append(") ");
        } else {
            ctx.operator(0).accept(this);
            if(ctx.AND() != null || ctx.OR() != null) {
                if(ctx.AND() != null) {
                    query.append("AND ");
                } else {
                    query.append("OR ");
                }

                if(ctx.operator(2) != null) {
                    query.append(ctx.operator(2).accept(this));
                } else {
                    query.append(ctx.expression().accept(this));
                }
            }
        }






        return query.toString();
    }

    @Override
    public String visitOperator(MySqlGeneratorParser.OperatorContext ctx) {
        return "OPERATOR TODO";
    }

    @Override
    public String visitOrderByClause(MySqlGeneratorParser.OrderByClauseContext ctx) {
        return super.visitOrderByClause(ctx);
    }

    @Override
    public String visitGroupByClause(MySqlGeneratorParser.GroupByClauseContext ctx) {
        return super.visitGroupByClause(ctx);
    }

    private String genIfNotNull(Object object, String gen) {
        return object == null ? "" : gen;
    }

}
