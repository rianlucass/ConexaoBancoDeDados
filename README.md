<h1>Sistema de Gerenciamento com Conexão ao Banco de Dados Simples desenvolvido com **Java** utilizando a biblioteca **JDBC** para realizar a conexão e manipulação de dados em um banco de dados MySQL. 
O objetivo do sistema é demonstrar a interação com o banco de dados através de operações básicas como **inserir**, **excluir** e **consultar** registros.</h1>

Foi ultilizado **JDBC (Java Database Connectivity)**: Para conectar e executar operações no banco de dados.

Estrutura do Projeto

<h2>1. Classe de Conexão</h2>
A classe `ConexaoBanco` é responsável por estabelecer a conexão com o banco de dados. Ela utiliza o **Driver JDBC** para conectar-se ao banco MySQL.

<h3>Principais classes e métodos:</h3>
  - Método `conectar()`: Retorna um objeto `Connection` para ser usado nas operações de manipulação de dados.

- **Inserir Dados:**
  - Implementado com o comando `INSERT INTO` e o uso de `PreparedStatement` para evitar vulnerabilidades como SQL Injection.
  
- **Excluir Dados:**
  - Implementado com o comando `DELETE FROM`, permitindo excluir registros com base em condições específicas, como o ID.

- **Consultar Dados:**
  - Implementado com o comando `SELECT`, possibilitando recuperar e listar registros do banco.

<h2>3. Classe de Teste</h2>
A classe teste realiza a execução dos métodos para testar a interação com o banco de dados, simulando cenários como cadastro, exclusão e consulta.
