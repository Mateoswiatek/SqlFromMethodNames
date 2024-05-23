grammar MySqlGenerator;
// https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

/*
tabela1findAll
tabela1findCount
tabela1findCountkolumna2SUBtabela2findAll
tabela1findCountkolumna2kolumna3
tabela1findAllBykolumna1LessThanOrEquals
*/


TABLENAME // to będzie dynamicznie dodawane, na podstawie skanowania.
    : 'tabela1' | 'tabela2' | 'tabela3'
    ;

COLUMNNAME // to również będzie dynamicznie dodawane, na podstawie skanowania
    : 'kolumna1' | 'kolumna2' | 'kolumna3'
    ;
ALL: 'All';
SUBQUERY: 'SUB';


// do zagnieżdżen
top
    : query EOF
    ;

query
    : TABLENAME statement
    ;

statement
    : findStatement
    //| deleteStatement | updateStatement
    ;


findStatement
    : FIND selectItem (whereClause)? (orderByClause)? //(orderByClause)? (limitClause)? (groupByClause)?
    ;

selectItem
    : ALL | (aggregateOrColumnOrSubQuery)+
//    | aggregateOrColumn (AND aggregateOrColumn)* // ma się generować aggregateOrColumn, aggregateOrColumn ...
    ;

aggregateOrColumnOrSubQuery
    : aggregateFunction | COLUMNNAME | (SUBQUERY query)
    ;

aggregateFunction
    : COUNT ALL
    | (COUNT | SUM | AVG | MIN | MAX) COLUMNNAME ;

//===============================================================
//                          WHERE
//===============================================================
//todo zrobic nawiasowanie
//leftParen : 'LL';
//rightParen : 'RR';
// ROZWINĄĆ Z DOKUMENTACJI Like, Null, After

whereClause
    : WHERE condition
    ;

condition
    : variableExpression (logicalOperator variableExpression)*
    ;


variableExpression
    :COLUMNNAME expression
    ;

expression
    : (NOT)? comparisonOperator (logicalOperator (NOT)? comparisonOperator)*
    ;

logicalOperator
    : AND
    | OR
    ;

comparisonOperator
    :('Equals' | 'LessThan' | 'GreaterThan' | 'Between') (COLUMNNAME)?
    ;

//===============================================================
//                          ORDER BY
//===============================================================
orderByClause
    :

WS
    : [ \t\r\n]+ -> skip // Ignoruj białe znaki między tokenami
    ;



//Operacje na bazie danych
FIND: 'find';

// Agregatory
COUNT: 'Count';
SUM: 'Sum';
AVG: 'Avg';
MAX: 'Max';
MIN: 'Min';


AND: 'And';
OR: 'Or';
NOT: 'Not';

WHERE: 'Where';



//

//
//whereClause
//    : WHERE condition
//    ;
//
//condition
//    : column comparator (logic column comparator)* // ma sie generowac " ? ", i tu będą przekazywane kolejne wartości z metody
//    ;
//
//logic
//    : 'And'
//    | 'Or'
//    ;
//
//comparator
//    : 'Equals' | 'NotEquals' | 'LessThan' | 'LESS_THAN_OR_EQUALS' | 'GREATER_THAN' | 'GREATER_THAN_OR_EQUALS'
//    ;
//
//orderByClause
//    : 'OrderBy' column
//    ;
//
//column
//    : IDENTIFIER
//    ;
//
//limitClause
//    : 'limit' // ma sie generować "limit ? "
//    ;









//action
//    : findExpression
//    | deleteExpression
//    ;
//
//findExpression
//    : 'find' ( ALL | aggregateList ) FROM IDENTIFIER
//    ;
//
//deleteExpression
//    : DELETE
//    ;
//
//
//aggregateList
//    : aggregateOrColumn (COMMA aggregateOrColumn)*
//    ;
//
//aggregateOrColumn
//    : aggregate
//    | IDENTIFIER
//    ;
//
//aggregate
//    : AGGREGATE '(' column ')'
//    ;
//
//AGGREGATE
//    : 'Count' | 'Avg' | 'Sum' | 'Min' | 'Max'
//    ;
//
//column
//    : IDENTIFIER
//    ;
//
//IDENTIFIER
//    : [a-zA-Z_][a-zA-Z_0-9]*
//    ;
//
//WS
//    : [ \t\r\n]+ -> skip // Ignoruj białe znaki między tokenami
//    ;



//query: TABLENAME''command''flag EOF ;
//
//command
//    : 'find' | 'update' | 'detelete'
//    ;
//
//flag: 'all' | 'first' | ('limit' NUMBER*)
//
//TABLENAME : LETTER (LETTER | DIGIT | '_')* ;
//fragment LETTER : [a-zA-Z] ;
//fragment DIGIT : [0-9] ;