# Simple Spring Boot API REST with MySQL

Este projeto é uma API REST simples criada com Spring Boot que se conecta a um banco de dados MySQL local.

## Requisitos

- Java 11 ou superior
- Maven
- MySQL

## Configuração do Projeto

´´
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
´´

Atualize as configurações de conexão com o banco de dados no arquivo src/main/resources/application.properties:

``
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
``

## Construção e Execução

``
.\mvnw spring-boot:run
``
