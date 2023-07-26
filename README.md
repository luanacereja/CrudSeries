<h1 align="center">
  TODO List
</h1>


API para gerenciar Series (CRUD).


## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/serielist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Serie
```
$ http POST :8080/series name="Serie 1" description="Nova serie" country="China" watched=true qtdEpisodes=76 genre="Historical, Drama, Melodrama, Political"

[
    {
        "name":"Serie 1",
        "description":"Nova serie",
        "country":"China",
        "watched":true,
        "qtdEpisodes":76,
        "genre":"Historical, Drama, Melodrama, Political"
    
    }
]
```

- Listar Series
```
$ http GET :8080/series

[
  {
        "name":"Serie 1",
        "description":"Nova serie",
        "country":"China",
        "watched":true,
        "qtdEpisodes":76,
        "genre":"Historical, Drama, Melodrama, Political"
  }
]
```

- Atualizar Serie
```
$ http PUT :8080/series/1 name="Serie 1 Up" description="Nova serie Up" country="China" watched=false qtdEpisodes=76 genre="New genre"

[
  {
        "name":"Serie 1 Up",
        "description":"Nova serie Up",
        "country":"China",
        "watched":true,
        "qtdEpisodes":76,
        "genre":"New genre"
  }
]
```

- Remover Serie
```
http DELETE :8080/series/1

[ ]
```