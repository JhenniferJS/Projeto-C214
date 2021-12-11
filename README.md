[![CI](https://github.com/JhenniferJS/Projeto-C214/actions/workflows/main.yml/badge.svg)](https://github.com/JhenniferJS/Projeto-C214/actions/workflows/main.yml)


<h1 align="center">
    <img alt="TocAi" title="#TocAi" src="src/main/resources/images/logo_size_quadrado-removebg-preview.png" />
</h1>

<h1 align="center">Prot�tipo de uma plataforma musical :musical_note:</h1>

- [Sobre](#sobre)
- [Pr� requisitos](#pr�-requisitos)
- [Depend�ncias](#depend�ncias)
- [Clonando reposit�rio](#clonando-reposit�rio)
- [Banco de dados](#banco-de-dados)
- [Como executar a aplica��o](#como-executar-a-aplica��o)
- [Como executar os testes](#como-executar-os-testes)

## Sobre

Projeto desenvolvido para a mat�ria de Engenharia de Software - C214.

Trata-se de um prot�tipo de plataforma musical, denominado TocA�, desenvolvido na linguagem Java e com conex�o ao banco de dados.

Para que seu funcionamento ocorra da forma esperada, foram realizados testes unit�rios e ferramenta de integra��o cont�nua.

### Projeto desenvolvido com o Monitor Leonardo :wink:

## Pr� Requisitos

Antes de come�ar, voc� vai precisar ter instalado em sua m�quina as seguintes ferramentas:

- [Git](https://git-scm.com/)
- [Java](https://www.java.com) Vers�o 1.8
- [Maven](https://maven.apache.org) Vers�o 3.8.2 ou superior
- [MySQL](https://www.mysql.com/)
- [Eclipse](https://www.eclipse.org/downloads/) (Opcional)

## Depend�ncias

Nesse projeto foi utilizado as seguintes dep�ndencias:

- [JUnit](https://junit.org/junit4/) Vers�o 4.13.2
- [PowerMock](https://github.com/powermock/powermock) Vers�o 2.0.9
- [EasyMock](https://easymock.org/) Vers�o 2.0.9

## Clonando Reposit�rio

Para clonar o reposit�rio em algum lugar na sua m�quina, basta utilizar o comando abaixo:
```bash
$ git clone https://github.com/JhenniferJS/Projeto-C214.git
```
## Banco de Dados

O script para cria��o do banco de dados no MySQL est� no diret�rio ProjetoC214/src/main/resources/banco_dados/codigoSQL.sql

Para esse prot�tipo, os dados para conex�o ao banco de dados est�o fixos no c�digo. Portanto, deve-se utilizar os valores abaixo:

- Porta: 3306
- Usu�rio: root
- Senha: inatel 

## Como executar a aplica��o

Antes de executar a aplica��o, deve-se gerar o arquivo .jar
Para isso, o comando abaixo na ra�z do projeto:
```bash
$ mvn clean install
```
Ao t�rmino da execu��o, ser� gerado o arquivo ProjetoC214-1.0-with-dependencies.jar no diret�rio ProjetoC214/target/.

Em seguida, pode-se iniciar a aplica��o utilizando o seguinte comando na ra�z do projeto:
```bash
$ java -jar target/ProjetoC214-1.0-with-dependencies.jar
```

## Como executar os testes

Para executar os testes na sua m�quina, basta utilizar o comando abaixo na ra�z do projeto:
```bash
$ mvn clean test
```
