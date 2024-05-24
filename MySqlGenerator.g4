grammar MySqlGenerator;
// https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html



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
//FIND: 'find';
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
    : TABLENAME statement
    ;

statement
    : (findStatement | deleteStatement)
//    //| deleteStatement | updateStatement | insertStatement
    ;


findStatement
    : 'find' selectItem findAdditionalClausules //(limitClause)? (Having)?
    ;

findAdditionalClausules
    : (whereClause)? (groupByClause)? (orderByClause)?
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
    | (NOT)? LPAREN (variableexpression | condition) RPAREN)
    ;

variableexpression
    : COLUMNNAME expression
    ;

// mozna by uprościc i dać oddzielnie operatory. ale po co sobie uturdniać.
expression
    : operator
    | operator AND (operator | expression)
    | operator OR (operator | expression)
    | (NOT)? LPAREN (operator | expression) RPAREN
    ;

operator
    : simpleoperator (COLUMNNAME)?
    | IS_NULL | (BETWEEN (COLUMNNAME)? AND (COLUMNNAME)?)
//    | IN (query)?
    ;

simpleoperator
    : (EQUALS | LESSTHAN | GREATERTHAN)
    ;

EQUALS: 'Equals';
LESSTHAN: 'LessThan';
GREATERTHAN: 'GreaterThan';
BETWEEN: 'Between';

//===============================================================
//                          ORDER BY
//===============================================================

orderByClause
    : ORDER_BY (orderColumn)+
    ;

orderColumn
    : COLUMNNAME (ASC | DESC)?
    ;

groupByClause
    : GROUP_BY (COLUMNNAME)+;

WS
    : [ \t\r\n]+ -> skip // Ignoruj białe znaki między tokenami
    ;

//TABLENAME : LETTER (LETTER | DIGIT | '_')* ;
//fragment LETTER : [a-zA-Z] ;
//fragment DIGIT : [0-9] ;