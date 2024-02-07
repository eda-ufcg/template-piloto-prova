# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Template Prova

Este roteiro foi desenvolvido para assegurar que os alunos estão familiarizados como a infraestrutura da disciplina para recebimento, entrega e correção das provas.

## Recebendo a prova

A prova é prática. Muitas vezes envolve código já escrito por mim e que vocês vão alterar ou evoluir. Portanto, você deve clonar o repositório do assignment. 

> Passo 1: Aceite o assignment: [https://classroom.github.com/a/WKxyjP9N](https://classroom.github.com/a/WKxyjP9N)

> Passo 2: Faça o clone do template: `git clone https://github.com/eda-ufcg/template-piloto-prova-XXXXXXX.git`

## Entendendo o template e fazendo a prova

Leia as instruções que estão no README do repositório https://github.com/eda-ufcg/template-piloto-prova-XXXXXXX.git. Toda a informação necessária para fazer a prova estará descrita no README. Para esse simulado, vou deixar aqui as instruções:


    Move impostor
    
    Escreva o método moveImpostor que encontra e move o impostor de um array
    de inteiros uma lista de inteiros. O impostor é o **primeiro** número que quebra uma sequencia em ordem crescente. Por exemplo, na sequência:
    
        1 2 4 3 7 90
    
    O impostor é o elemento 3.
    
    Além de encontrar o impostor, você deve posiciona-lo em seu devido lugar. 
    Para o exemplo acima, seu método deve alterar o array 
    para: 1 2 3 4 7 90.
    
    *Importante!* Só há um impostor. 
    Como dito anteriormente, é o primeiro elemento que quebra uma sequência ordenada.
    
    Veja outro exemplo:
    
    
        5 7 8 19 -4 4 1 6 8 12 81 3
        
        Nessa sequência, o impostor é o elemento -4. Após a execução do seu algoritmo, o array deve ficar neste estado:
    
        -4 5 7 8 19 4 1 6 8 12 81 3
    
    #### Funções que NÃO são permitidas
    Seu programa deve apenas manipular o array de inteiros.
    
        - insert
        - remove
        - pop
        - qualquer função de ordenação

### O template

> Não altere o arquivo pom.xml

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/test/java/**

## Trabalhando com o código

Executar os comandos abaixo no diretório raiz do seu projeto (onde está o arquivo pom.xml).

> Compilando: `mvn compile`

> Executando os testes: `mvn test`

## Entregando a prova

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes públicos. Isso deve ser feito com os comandos do mvn (compile e test).

> Passo 2. Submeta as suas modificações para o repositório

  * `git pull`
  * `git commit -m "entregando a prova"`
  * `git push origin main`
