# 🏛️ Fórum Hub - Challenge ONE Java Back End

<div align="center">
  <img src="https://github.com/user-attachments/assets/e6013aad-e9a6-4375-89fc-84a3efea7dfb" alt="Banner Forum Hub" width="850">
</div>

<p align="center">
  <img src="https://img.shields.io/badge/Status-Concluido!-blue" alt="Status">
  <img src="https://img.shields.io/badge/API_REST-green" alt="API">
  <img src="https://img.shields.io/badge/Challenge_ONE-Java_Back_End_Alura-00FF00" alt="Challenge">
  <img src="https://img.shields.io/github/stars/Antonioafj?style=social" alt="Stars">
</p>

## 📖 Descrição do Projeto
O **Fórum Hub** é uma API REST robusta que simula o funcionamento de um fórum de discussões. O projeto foca no gerenciamento de tópicos, onde os usuários podem criar, visualizar, atualizar e deletar (CRUD) mensagens e assuntos. 

Este desafio é o ápice da trilha Java, aplicando conceitos avançados de **Segurança Autenticada**, **Boas Práticas de API REST** e **Versionamento de Banco de Dados**.

---

## 🚀 Funcionalidades e Demonstração
- `CRUD Completo`: Gerenciamento total de tópicos (Criar, Listar, Detalhar, Atualizar e Excluir).
- `Segurança Avançada`: Implementação de autenticação e autorização via **Spring Security** e **JWT**.
- `Validações de Negócio`: Regras para evitar tópicos duplicados e garantir a integridade dos dados.
- `Database Migrations`: Controle de versões do banco de dados utilizando **Flyway**.

### 📽️ Demonstração em execução:
<div align="center">
  <img src="https://github.com/user-attachments/assets/6e02398b-28c5-42f2-98b5-58e29e9cc625" alt="GIF de demonstração Forum Hub" width="600">
</div>

---

## 🛠️ Técnicas e Tecnologias Utilizadas
- **Java 17+**: Linguagem base.
- **Spring Boot 3**: Framework para construção da API.
- **Spring Security & JWT**: Segurança e tokens de acesso.
- **Spring Data JPA**: Abstração da persistência de dados.
- **MySQL**: Banco de dados relacional.
- **Flyway**: Migrações de banco de dados.
- **Maven**: Gerenciador de dependências.

## 🔧 Como rodar o projeto
1. **Clone o repositório:**
   git clone https://github.com/Antonioafj/challenge-forum-hub.git

2. **Configuração de Ambiente:**
   - Configure o banco MySQL no arquivo `application.properties`.
   - Certifique-se de definir uma variável de ambiente para o segredo do JWT (Secret Key).

3. **Execução:**
   mvn spring-boot:run

## 📂 Acesso ao Projeto
Você pode acessar todos os arquivos do projeto [clicando aqui](https://github.com/Antonioafj/challenge-forum-hub).

---

## 👤 Autor
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Antonioafj">
        <img src="https://avatars.githubusercontent.com/u/167789057?v=4" width="115px;" alt="Antonio Alves Ferreira Jr."/><br>
        <sub><b>Antonio Alves Ferreira Jr.</b></sub>
      </a>
    </td>
  </tr>
</table>

---
*Projeto desenvolvido como parte do Challenge ONE - Alura + Oracle*
