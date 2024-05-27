## SQL Query Generator
# Presentation during classes
Own implementation similar to springData.
Generating SQL queries based on method names and source code metadata.

The programmer creates a repository class in it
creates methods whose name defines the content of the query,
using a very simple naming convention.

It also passes parameters to this query.

the name of the base table, in order to minimize data required from the programmer,
will be supplied (appended to the beginning of the method name) using metadata
next to the repository class -> Parameterized class, and in the entity class the appropriate annotation.
Which defines the table name.

names of possible tables and columns - attributes, will be dynamically defined in the grammar on 
code scanning stage.
(Like Hibernate)

Select - downloading data,
all records, specific columns, aggregate functions, any configurations that
are allowed by SQL.

To enable greater polymorphism, aggregation structures - additional clauses - have been added.
This makes the code more readable, and this approach will require less
the number of changes in the code when adding subsequent clauses.
It will just be another item in the list (children of findAdditionalClausules)

Defining a stanza
- Everything, or kspecific columns and or aggregators. only in Count it can be *.
Aggregators determine on which column the aggregation is to be performed.

- For development purposes, you could add subqueries here.

Additional clauses:
- Where - the condition may apply to one/many columns. possibility of negation and bracketing
they provide access to the full benefits that logic gives us.

we define the column for which we will define the expression.
the expression itself is an interesting thing.
In order to reduce data redundancy, it is possible to define for one column
many logical conditions. What's more, it's right here
possibility of variable injection. 
After specifying the condition, the programmer can either specify a different column,
as the second argument of a condition or pass a value as an argument to the responsible method
this specific query.

table1findAllWherecolumn1LessThankcolumn2
table1findAllWherecolumn1LessThan

Between is a special operator because it is a binary operator. Here too,
you can either define columns or pass variables.
Given one argument, there will always be a lower bound

table1findAllWherecolumn1BetweenAnd
table1findAllWherecolumn1Betweencolumn1And

Order By -> we pass one or more columns. a direction can be defined for each
sorting. default is ASC. ascending from 0 to 100...

Grouping by - we provide one or more columns.


# Description
The aim of the project is to create a tool that automatically generates SQL queries based on processed method names.

This tool uses **Antlr 4** to parse method names and construct appropriate SQL queries,
allowing you to quickly create complex queries without having to write SQL manually.

The program allows you to generate basic and more advanced SQL queries.
Valid SQL queries are generated.

To negate an expression, it is necessary to place the expression between brackets (LL RR)

At the current stage, the generator converts the String object into String. Ultimately, the returned String will be injected into the body of the appropriate method in the appropriate repository class.


The grammar is available in the file **MySqlGenerator.g4**

# Technologies
- Antlr4
- Java 21
- Maaven
- Loombok
- Slf4j

# Examples
More generation examples are available in the example directory.

tabela1findkolumna1Avgkolumna2Wherekolumna1LessThanOrLessThanOrLessThanAndLLLessThanAndLessThanRRAndkolumna1LessThankolumna2Andkolumna2EqualsGroupBykolumna2OrderBykolumna1
![obraz](https://github.com/Mateoswiatek/SqlFromMethodNames/assets/115046087/dde7871b-67b2-473f-9cf3-8a0dacb8743c)

tabela1findAllWherekolumna1EqualsOrderBykolumna2kolumna1Desc
![obraz](https://github.com/Mateoswiatek/SqlFromMethodNames/assets/115046087/5f58d279-bac7-4cfa-b073-a975f1b48ce2)

tabela1findkolumna1Avgkolumna2WhereNotLLkolumna1LessThanRR
![obraz](https://github.com/Mateoswiatek/SqlFromMethodNames/assets/115046087/97296814-b1eb-431b-ba52-14db2ca11a86)


# Further Possible Development
- Dodanie innych operacji dostępnych na bazie danych.
- Uzupełnienie o wszystkie, bardziej wyspecjalizowane funkcjonalności.
- Rozwinięcie adnotacji, dynamiczne generowanie dostępnych nazw.
    - Dodanie możliwości definiowania innych nazw kolumn w bazie danych (domyślnie nazwaPolaWKlasie.toLowerCase() == nazwa w bazie danych)
    - Dodanie możliwości dodania customowej nazwy tabeli jaka jest w bazie danych
    - Dodanie adnotacji zapewniającej iż pole nie jest nullem.
    - Dodanie adnotacji którą można oznaczyć klucz główny.
    - Dodanie możlwiości dodania bazy danych w której ten obiekt się znajduje.
    - Wiele wiele innych

```Java
@MyAdnotation
MyUserRepository implements CustomSpringData<User, Long> {
    User findAll();
}
```

source of inspiration [jpa query-methods](https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html)

The project was created for the course "Compilation theory and compilers" in the field of Computer Science and Intelligent Systems at the AGH University of Science and Technology in Krakow.
