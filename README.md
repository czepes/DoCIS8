# DoCIS Lab #8

Development of Corporate Information Systems Laboratory #8 (based on lab #7).

## Install

### ActiveMQ Artemis

Install and run `ActiveMQ Artemis 2.27.0` server.

Configure `Broker URL` and `Queue` in [`application.properties`](src/main/resources/application.properties).

Links:
- [Download](https://activemq.apache.org/components/artemis/download/)
- [Using the Server](https://activemq.apache.org/components/artemis/documentation/latest/using-server.html)

### Database

Autoconfigured with help of Spring Boot.

Can be manually installed using [`data.sql`](src/main/resources/data.sql) and 
[`schema.sql`](src/main/resources/schema.sql)to create table and fill it with test values.

Configure Database connection in [`application.properties`](src/main/resources/application.properties).

### Server

`Apache Tomcat 10` embedded with Spring Boot.

### REST Client

At  [`ru.sfu.rest.RestClient.java`](src/main/java/ru/sfu/boot/rest/RestClient.java),
set the `URL` variable to the URL of the configured server and run `RestClient.java`.

## Dependencies

Project is built with Spring Initializr and Maven based on `spring-boot-starter-parent 3.0.0`.

List of used Spring Boot [dependencies](pom.xml):
- Spring for Apache ActiveMQ Artemis
- Spring Data JPA
- Thymeleaf
- Validation
- Spring Web
- Spring Boot DevTools
- PostgreSQL Driver

## Spring Boot
### Purpose of work
Become familiar with the SpringBoot.
### General formulation
Modify the application from Lab #7, #6, or #5 (at the student's discretion) using SpringBoot.

Translated with www.DeepL.com/Translator (free version)
