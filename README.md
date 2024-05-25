Celem projektu jest stworzenie narzędzia,
które automatycznie generuje zapytania SQL na
podstawie przetworzonych nazw metod. Narzędzie to wykorzystuje Antlr
do parsowania nazw metod i konstruowania odpowiednich zapytań SQL,
co umożliwia szybkie tworzenie złożonych zapytań bez potrzeby ręcznego pisania SQL.




Dalszy rozwój:
- Dodanie innych operacji dostępnych na bazie danych.
- Uzupełnienie o wszystkie, bardziej wyspecjalizowane funkcjonalności.
- Rozwinięcie adnotacji, dynamiczne generowanie dostępnych nazw.
    - Dodanie możliwości definiowania innych nazw kolumn w bazie danych (domyślnie nazwaPolaWKlasie.toLowerCase() == nazwa w bazie danych)
    - Dodanie możliwości dodania customowej nazwy tabeli jaka jest w bazie danych
    - Dodanie adnotacji zapewniającej iż pole nie jest nullem.
    - Dodanie adnotacji którą można oznaczyć klucz główny.
    - Dodanie możlwiości dodania bazy danych w której ten obiekt się znajduje.
    - Wiele wiele innych


- Założenia programu
    - Stworzenie customowej adnotacji na wzór SpringData. Generacja implementacji zapytań do bazy danych na podstawie nazw metod w interfejsie oraz przekazanych klas.
- Gramatyka przetwarzanego formatu
- Informacja o stosowanych generatorach skanerów/parserów, pakietach zewnętrznych,
- Dodaj adnotację do swojego interface którym chcesz wykonywać zapytania do bazy danych. Oznacz odpowiednimi adnotacjami swoją encję i gotowe! Dzięki mojemu poświęceniu, Ty już nie musisz martwić się zapytaniami SQL.
- Programista tworzy swój interface np:

  @MyAdnotation
  MyUserRepository implements CustomSpringData<User, Long> {
  User findAll();
  }

inspiracja
https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
