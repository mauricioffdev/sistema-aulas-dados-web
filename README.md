🎸 sistema-aulas-dados-web  

Sistema para gerenciamento de aulas de guitarra, desenvolvido com Java Spring Boot e banco de dados H2.

Como executar  

No terminal, dentro da pasta do projeto, execute:

bash  

./mvnw spring-boot:run  

Ou, se não estiver utilizando o wrapper do Maven:

bash  

mvn spring-boot:run  

Acessando o banco H2  

Abra o navegador e acesse:

Código  

http://localhost:8080/h2-console  

Utilize as seguintes credenciais:

JDBC URL: jdbc:h2:file:./data/sistema-aulas

Usuário: sa

Senha: (deixe em branco)

Os dados são salvos localmente na pasta ./data/.

Você pode visualizar e manipular os dados diretamente pelo console web do H2.

Autor: mauricioffdev
