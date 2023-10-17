## Projeto DIO - Trilha Java Básico

www.dio.me &ensp; | &ensp; Instrutor - [Gleyson Sampaio](https://github.com/glysns)

## Sintaxe Desafio

Nesse projeto exercitei o conteúdo apresentado no módulo de Sintaxe, codificando o seguinte cenário:

1. Criei um projeto `ContaBanco` que recebe dados via terminal de informações de Usuário como: Nome, Agência, Conta e Valor desejado para saque.

2. Dentro do projeto, criei uma classe `ContaTerminal.java` para realizar todas as codificações do programa, com os seguintes atributos mencionados abaixo.


| Atributo  | Exemplo   
| --------- | ------- 
| Numero:    | 1021 
| Agência:   | 067-8
| Nome Cliente: | Nome e Sobrenome
| Saldo: |237.48
&ensp;
&ensp;
## Objetivo do Projeto

3. Depois de todas as informações terem sido inseridas, através do imput em linha de comando, o sistema exibe as informações como output com a seguinte mensagem:

Olá "Nome e Sobrenome", 
    Obrigado por criar uma conta em nosso banco! 

"Sua agência é:"xxx-x", Conta:"xxxx" , Seu saldo de:R$"xxx.xx" Já está disponível para saque."              "Até logo Volte Sempre!!!"

&ensp;
&ensp;

## Conclusão
#### Class Scanner
Após importar a classe Scanner atráves do "import java.util.Scanner;" segue-se com a criação do objeto do tipo Scanner que passa como argumento o objeto System.in dentro do construtor.
O objeto System.in é o que faz a leitura do que se escreve no teclado. 
Ou seja, para cada um dos primitivos existe uma chamada do método para retornar o valor especificado na entrada de dados, sempre seguindo o formato "nextTipoDado().