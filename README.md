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

Detalhes: Dados salvos localmente em ./data/  
Console H2 para ver os dados direto pelo navegador

Autor: mauricioffdev
