# Projeto que utiliza mensageria responsiva com JMS e Active MQ

## Esse projeto é dividido em três partes:

- Instalar o ActiveMQ e criar uma fila;
- Consumir essa fila e gravar o conteúdo em uma base no database do mysql;
- Produzir nessa fila;

## Tecnologias utilizadas

- Java
- Springboot
- Lombok
- Hibernate
- ActiveMQ
- JMS

## Como instalar

### Primeiros passos

Crie um database no mysql chamando de persons

### Parte 1: Instalar o ActiveMQ no windows e criar fila

Realizar o download do ActiveMQ, nesse link https://activemq.apache.org/components/classic/download/

Depois de descompactar, é só ir até o caminho ..\apache-activemq-version-bin\apache-activemq-version\bin\win64 e executar o script InstallService.bat. É possível verificar isso nos serviços do Windows.

O console do ActiveMQ é nesse url: http://localhost:8161

Para criar uma fila, clique na opção sinalizada “Manage ActiveMQ broker” e na tela de login digite admin como usuário e senha

### Parte 2: Consumindo mensagens

Projeto na pasta consumer-mq

### Parte 3: Produzir mensagens

Projeto na pasta producer-mq

## Como executar

Para acessar a API acesse o link http://localhost:8081,

## Dúvidas

Caso há alguma dúvida em relação a este repositório, envie para davigomesflorencio@gmail.com.