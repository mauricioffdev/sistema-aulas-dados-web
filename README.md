# Sistema de Aulas - Dados Web

Projeto desenvolvido em Java com Spring Boot para gerenciar dados de alunos, aulas e pagamentos.

---

## Funcionalidades

- Cadastro, edição e listagem de alunos
- Histórico de aulas para cada aluno
- Controle de pagamentos vinculados aos alunos
- Persistência dos dados com banco H2 (arquivo local)
- Backend totalmente em Java, com modelo MVC

---

## Requisitos

- Java 17 ou superior
- Maven
- IDE (IntelliJ, VSCode, Eclipse, etc) ou terminal

---

## Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/mauricioffdev/sistema-aulas-dados-web.git

Entre na pasta do projeto:

bash
Copiar
Editar
cd sistema-aulas-dados-web
Compile e rode a aplicação com Maven:

bash
Copiar
Editar
./mvnw spring-boot:run
Ou, se tiver Maven instalado:

bash
Copiar
Editar
mvn spring-boot:run
Acesse no navegador:

API e páginas HTML: http://localhost:8080

Console do banco H2 (persistente em arquivo): http://localhost:8080/h2-console

Configurações
Banco H2 configurado para salvar dados localmente no arquivo ./data/sistema-aulas.

Usuário: sa

Senha: (vazio)

Próximos passos
Exportar dados para Excel

Melhorar front-end para facilitar o uso

Implementar autenticação

Autor
Mauricioffdev

