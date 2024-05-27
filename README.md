## SQL Query Generator
# Prezentacja
Własna implementacja na wzór springData.
Generowanie zapytań SQL na podstawie nazw metod oraz metadanych kodu źródłowego.

Programista tworzy klasę repository, w niej
tworzy metody, których nazwa definiuje treść zapytania,
za pomocą bardzo prostej konwencji nazewnczej.

Przekazuje również parametry do tego zapytania.

nazwa tabeli podstawowej, w celu minimalizacji wymagandych danych od programisty,
będzie dostarczana (dopisywana na poczatku nazwy metody) uzywając metadanych
przy klasie repozytorium -> Klasa parametryzowana, a w klasie encji odpowiednia adnotacja.
Która definiuje nazwę tabeli.

nazwy możliwych tabel jak i kolumn - atrybutów, będa dynamicznie definiowane w gramatyce na 
etapie skanowania kodu.
(Jak Hibernate)

Select - pobieranie danych,
wszystkie rekordy, konkretne kolumny, funkcje agregujące, dowolne konfiguracje, które
są dozwolone przez SQLa.

Aby umożliwić większy polimorfizm, zostały dodane struktury agregujące - dodatkowe klauzule.
Dzięki czemu kod jest czytelniejszy, oraz takie podejście będzie wymagało mniejszej
ilości zmian w kodzie przy dodawaniu kolejnych klauzul.
Będzie to po prostu kolejny element na liście (dzieci findAdditionalClausules)

Definiowanie zwrotki
- Wszystko, lub kkonkretne kolumny i lub agregatory. tylko w Count może byc *.
Agregatory przymują na jakiej kolumnie agregacja ma zostać dokonana.

- Rozwojowo, tu można by dodać podzapytania.

Dodatkowe klauzule:
- Where - warunek może dotyczyć jednej / wielu kolumn. możliwość negacji oraz nawiasowania
zapewniają dostęp do pełnego dobrodziejstwa jaką daje nam logika.

definiujemy kolumne dla której bedziemy określać wyrażenie.
samo wyrażenie jest ciekawą rzeczą.
W celu redukcji redundancji danych, możliwe jest definiowanie dla jednej kolumny
wielu warunków logicznych. Co więcej, to własnie tutaj jest
możliwość wstrzykiwania zmiennych. 
Po określeniu warunku, programista może albo okreslić inną kolumnę,
jako drugi argument warunku lub przekazać wartość jako argument metody odpowiedzialnej za
to konkretne zapytanie.

tabela1findAllWherekolumna1LessThankolumna2
tabela1findAllWherekolumna1LessThan

Between jest specjalnym operatorem, gdyz jest to operator dwuargumentowy. Tutaj również,
można definiować albo kolumny, albo przekazywać zmienne.
Podając jeden argument, zawsze będzie dolną granica

tabela1findAllWherekolumna1BetweenAnd
tabela1findAllWherekolumna1Betweenkolumna1And
tabela1findAllWherekolumna1Betweenkolumna1And

Order By -> przekazujemy jedną lub więcej kolumn. dla każdej można zdefiniować kierunek
sortowania. domyślnie jest ASC. rosnąco od 0 do 100

Grouping by -  podajemy jedną lub więcej kolumn.



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
