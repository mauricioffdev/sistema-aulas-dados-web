sistema-aulas-dados-web
Sistema para gerenciar aulas de guitarra usando Java Spring Boot e banco H2.

Como rodar

No terminal, dentro da pasta do projeto, rode:

./mvnw spring-boot:run
ou, se não usar wrapper:

mvn spring-boot:run

Acessar banco H2

No navegador, acesse:

http://localhost:8080/h2-console

Use:

JDBC URL: jdbc:h2:file:./data/sistema-aulas

Usuário: sa

Senha: (vazia)

Configuração principal (application.properties)

spring.datasource.url=jdbc:h2:file:./data/sistema-aulas
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

Detalhes
Dados salvos localmente em ./data/

Console H2 para ver os dados direto pelo navegador

