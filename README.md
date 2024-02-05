# Template Prova

Este roteiro foi desenvolvido para assegurar que os alunos estão familiarizados como a infraestrutura da disciplina para recebimento, entrega e correção das provas.

## Recebendo a prova

A prova é prática. Muitas vezes envolve código já escrito por mim e que vocês vão alterar ou evoluir. Portanto, você deve clonar o repositório do assignment. 

> Passo 1: Aceite o assignment: [link](link)

> Passo 2: Faça o clone do template: `git clone https://github.com/eda-ufcg/template-prova-XXXXXXX.git`

## Entendendo o template e fazendo a prova

Leia as instruções que estão no README do repositório https://github.com/eda-ufcg/template-prova-XXXXXXX.git. Toda a informação necessária para fazer a prova estará descrita no README.

### O template

> Não altere o arquivo pom.xml

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/test/java/**

## Trabalhando com o código

> Compilando: `mvn compile`

> Executando os testes: `mvn tests`

## Entregando a prova

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes públicos. Isso deve ser feito com os comandos do mvn (compile e tests).

> Passo 2. Submeta as suas modificações para o repositório

  * `git pull`
  * `git commit -m "entregando a prova"`
  * `git push origin main`
