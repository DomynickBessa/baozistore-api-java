# 🥟 Baozi Store API

API REST desenvolvida para o controle de clientes, produtos e pedidos na loja baozi. Este projeto faz parte da disciplina de back-end.

## 🛠️ Tecnologias Utilizadas
* **Java 17**
* **Spring Boot 3.x**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória para testes)
* **Maven** (Gerenciador de dependências)

## 📂 Estrutura de Pastas
* `src/main/java/.../model`: Entidades (Cliente, Produto, Pedido).
* `src/main/java/.../repository`: Interfaces para comunicação com o banco.
* `src/main/java/.../controller`: Endpoints da API.

## 🚀 Como Rodar o Projeto
1. Clone o repositório.
2. Importe no Eclipse como **Existing Maven Project**.
3. Execute a classe `ApiApplication.java` como **Java Application**.
4. A API estará disponível em `http://localhost:8080`.

## 📌 Endpoints Principais
* `POST /cliente`: Cadastro de cliente.
* `POST /produto`: Cadastro de produtos.
* `POST /pedido`: Registro de venda (vincula Cliente e Produto).
* `GET /pedidos`: Listagem geral de vendas.
