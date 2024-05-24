grammar MySqlGenerator;
// https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

/*
tabela1findAll
tabela1findCount
tabela1findCountkolumna2SUBtabela2findAll
tabela1findCountkolumna2kolumna3
tabela1findAllWherekolumna1LessThanOrEquals
tabela1findkolumna1Avgkolumna2Wherekolumna1LessThanOrLessThanOrLessThanAndLLLessThanAndLessThanRR
tabela1findkolumna1Avgkolumna2Wherekolumna1LessThanOrLessThanOrLessThanAndLLLessThanAndLessThanRRAndkolumna1LessThankolumna2Andkolumna2Equals
tabela1findkolumna1OrderBykolumna2GroupBykolumna1
tabela1deleteWherekolumna1Equals
tabela1findkolumna1Wherekolumna1LessThanOrEqualsOrderBykolumna2GroupBykolumna1


full test:
tabela1findkolumna1Avgkolumna2Wherekolumna1LessThanOrLessThanOrLessThanAndLLLessThanAndLessThanRRAndkolumna1LessThankolumna2Andkolumna2EqualsOrderBykolumna1GroupBykolumna2
tabela1findAllWherekolumna1LessThan

*/


TABLENAME // to będzie dynamicznie dodawane, na podstawie skanowania. -> robimy Seta
    : 'tabela1' | 'tabela2' | 'tabela3'
    ;


COLUMNNAME // to również będzie dynamicznie dodawane, na podstawie skanowania -> robimy Seta.
    : 'kolumna1' | 'kolumna2' | 'kolumna3'
    ;


ALL: 'All';
SUBQUERY: 'SUB';
LPAREN : 'LL';
RPAREN : 'RR';

//Operacje na bazie danych
FIND: 'find';
DELETE: 'delete';

//Clause
WHERE: 'Where';
ORDER_BY: 'OrderBy';
GROUP_BY: 'GroupBy';

// Agregatory
COUNT: 'Count';
SUM: 'Sum';
AVG: 'Avg';
MAX: 'Max';
MIN: 'Min';

//Operatory Logiczne
AND: 'And';
OR: 'Or';
NOT: 'Not';

//Warunki
IS_NULL: 'IsNull';
IN: 'In';
// inne ...

//Sortowanie
ASC: 'Asc';
DESC: 'Desc';


// do zagnieżdżen querek
//top
//    : query EOF
//    ;

query
    : TABLENAME statement EOF
    ;

statement
    : (findStatement | deleteStatement)
//    //| deleteStatement | updateStatement | insertStatement
    ;


findStatement
    : FIND selectItem findAdditionalClausules //(limitClause)? (Having)?
    ;

findAdditionalClausules
    : (whereClause)? (orderByClause)? (groupByClause)?
    ;

deleteStatement
    : DELETE (whereClause)?
    ;

selectItem
    : (ALL | (aggregateOrColumnOrSubQuery)+)
    ;

aggregateOrColumnOrSubQuery
    :(COLUMNNAME | aggregateFunction)  // | (SUBQUERY query)
    ;

aggregateFunction
    : COUNT ALL
    | aggregationType COLUMNNAME ;

aggregationType:
    | (COUNT | SUM | AVG | MIN | MAX)
    ;


//===============================================================
//                          WHERE
//===============================================================
//todo ROZWINĄĆ Z DOKUMENTACJI Like, Null, After

//Rekurencyjne zagnieżdżenia. można dać wiele do tej samej kolumny.
whereClause
    : WHERE condition
    ;

condition
    : (variableexpression
    | variableexpression AND (variableexpression | condition)
    | variableexpression OR (variableexpression | condition)
    | LPAREN (variableexpression | condition) RPAREN)
    ;

variableexpression
    : COLUMNNAME expression
    ;

// mozna by uprościc i dać oddzielnie operatory. ale po co sobie uturdniać.
expression
    : operator
    | operator AND (operator | expression)
    | operator OR (operator | expression)
    | LPAREN (operator | expression) RPAREN
    ;

operator
    :('Equals' | 'LessThan' | 'GreaterThan' | 'Between') (COLUMNNAME)?
    | IS_NULL | ('Between' (COLUMNNAME)? AND (COLUMNNAME)?)
//    | IN (query)?
    ;

//===============================================================
//                          ORDER BY
//===============================================================

orderByClause
    : ORDER_BY COLUMNNAME (ASC | DESC)?;

groupByClause
    : GROUP_BY (COLUMNNAME)+;

WS
    : [ \t\r\n]+ -> skip // Ignoruj białe znaki między tokenami
    ;

//TABLENAME : LETTER (LETTER | DIGIT | '_')* ;
//fragment LETTER : [a-zA-Z] ;
//fragment DIGIT : [0-9] ;