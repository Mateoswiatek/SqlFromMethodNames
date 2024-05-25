## SQL Query Generator

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
