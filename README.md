# REbooks
# 📚 Book API

Uma aplicação em **Java com Spring Boot** para registrar, gerenciar e consultar livros em uma API REST.  
O projeto utiliza **H2 Database** como banco em memória, **Spring Data JPA** para persistência, **Flyway** para versionamento do banco de dados e **Springdoc OpenAPI** para documentação interativa da API.  
Também inclui **Thymeleaf** para exibição de páginas dinâmicas.

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**  
- **Spring Boot**  
  - spring-boot-starter-web → criação da API REST  
  - spring-boot-starter-data-jpa → persistência e ORM  
  - spring-boot-starter-thymeleaf → renderização de páginas HTML  
  - spring-boot-starter-test → testes unitários e de integração  
- **H2 Database** (banco em memória para desenvolvimento/testes)  
- **Flyway** (migração e versionamento do banco de dados)  
- **Lombok** (redução de boilerplate code)  
- **Springdoc OpenAPI** (Swagger UI para documentação)  

---

## 📂 Estrutura do Projeto

src/
├── main/java/com/example/bookapi/
│ ├── controller/ → Controladores REST e páginas Thymeleaf
│ ├── entity/ → Entidades JPA (Livro, etc.)
│ ├── repository/ → Interfaces de acesso ao banco
│ ├── service/ → Regras de negócio
│ └── BookApiApplication.java → Classe principal
│
└── main/resources/
├── db/migration/ → Scripts do Flyway
├── templates/ → Páginas Thymeleaf
└── application.yml → Configurações da aplicação

---

## ⚙️ Como Rodar o Projeto

### Pré-requisitos
- **Java 17+**
- **Maven 3.8+**

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/book-api.git
   cd book-api
Compile e rode a aplicação:

bash
Copiar código
mvn spring-boot:run
