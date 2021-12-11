[![CI](https://github.com/JhenniferJS/Projeto-C214/actions/workflows/main.yml/badge.svg)](https://github.com/JhenniferJS/Projeto-C214/actions/workflows/main.yml)


<h1 align="center">
    <img alt="TocAi" title="#TocAi" src="src/main/resources/images/logo_size_quadrado-removebg-preview.png" />
</h1>

<h1 align="center">Protótipo de uma plataforma musical :musical_note:</h1>

- [Sobre](#sobre)
- [Pré requisitos](#pré-requisitos)
- [Dependências](#dependências)
- [Clonando repositório](#clonando-repositório)
- [Banco de dados](#banco-de-dados)
- [Como executar a aplicação](#como-executar-a-aplicação)
- [Como executar os testes](#como-executar-os-testes)

## Sobre

Projeto desenvolvido para a matéria de Engenharia de Software - C214.

Trata-se de um protótipo de plataforma musical, denominado TocAí, desenvolvido na linguagem Java e com conexão ao banco de dados.

Para que seu funcionamento ocorra da forma esperada, foram realizados testes unitários e ferramenta de integração contínua.

### Projeto desenvolvido com o Monitor Leonardo :wink:

## Pré Requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- [Git](https://git-scm.com/)
- [Java](https://www.java.com) Versão 1.8
- [Maven](https://maven.apache.org) Versão 3.8.2 ou superior
- [MySQL](https://www.mysql.com/)
- [Eclipse](https://www.eclipse.org/downloads/) (Opcional)

## Dependências

Nesse projeto foi utilizado as seguintes depêndencias:

- [JUnit](https://junit.org/junit4/) Versão 4.13.2
- [PowerMock](https://github.com/powermock/powermock) Versão 2.0.9
- [EasyMock](https://easymock.org/) Versão 2.0.9

## Clonando Repositório

Para clonar o repositório em algum lugar na sua máquina, basta utilizar o comando abaixo:
```bash
$ git clone https://github.com/JhenniferJS/Projeto-C214.git
```
## Banco de Dados

O script para criação do banco de dados no MySQL está no diretório ProjetoC214/src/main/resources/banco_dados/codigoSQL.sql

Para esse protótipo, os dados para conexão ao banco de dados estão fixos no código. Portanto, deve-se utilizar os valores abaixo:

- Porta: 3306
- Usuário: root
- Senha: inatel 

## Como executar a aplicação

Antes de executar a aplicação, deve-se gerar o arquivo .jar
Para isso, o comando abaixo na raíz do projeto:
```bash
$ mvn clean install
```
Ao término da execução, será gerado o arquivo ProjetoC214-1.0-with-dependencies.jar no diretório ProjetoC214/target/.

Em seguida, pode-se iniciar a aplicação utilizando o seguinte comando na raíz do projeto:
```bash
$ java -jar target/ProjetoC214-1.0-with-dependencies.jar
```

## Como executar os testes

Para executar os testes na sua máquina, basta utilizar o comando abaixo na raíz do projeto:
```bash
$ mvn clean test
```
