# Decola Tech 2025 Desafio
Desafio Java RESTful API feito durante o bootcamp Decola Tech 2025

## Principais Tecnologias
- Java 17: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- Spring Boot 3: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
- Spring Data JPA: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- OpenAPI (Swagger): Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;

## Diagrama de Classes
```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
        +getName() String
        +setName(String name)
        +getAccount() Account
        +setAccount(Account account)
        +getFeatures() Feature[]
        +setFeatures(Feature[] features)
        +getCard() Card
        +setCard(Card card)
        +getNews() News[]
        +setNews(News[] news)
    }

    class Account {
        -String number
        -String agency
        -double balance
        -double limit
        +getNumber() String
        +setNumber(String number)
        +getAgency() String
        +setAgency(String agency)
        +getBalance() double
        +setBalance(double balance)
        +getLimit() double
        +setLimit(double limit)
    }

    class Feature {
        -String icon
        -String description
        +getIcon() String
        +setIcon(String icon)
        +getDescription() String
        +setDescription(String description)
    }

    class Card {
        -String number
        -double limit
        +getNumber() String
        +setNumber(String number)
        +getLimit() double
        +setLimit(double limit)
    }

    class News {
        -String icon
        -String description
        +getIcon() String
        +setIcon(String icon)
        +getDescription() String
        +setDescription(String description)
    }

    User --> Account : has
    User --> Card : has
    User --o Feature : has multiple
    User --o News : has multiple
```

