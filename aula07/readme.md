<img src="/assets/teste.svg" width="100%">

# Aula 7 - 07/04/2026

## Arrays (Vetores) em Java

Um **array** (ou vetor) é uma estrutura que permite armazenar **vários valores do mesmo tipo** em uma única variável.

Diferente de uma variável simples, que armazena apenas um valor, um array armazena vários valores organizados em posições.

---

## Declaração de um Array

Para declarar um array:

~~~java
int[] numeros;
~~~

---

## Criação de um Array

Após declarar, é necessário definir o tamanho:

~~~java
numeros = new int[5];
~~~

Isso cria um array com **5 posições**, indexadas de **0 a 4**.

---

## Declaração e Criação em uma Linha

~~~java
int[] numeros = new int[5];
~~~

---

## Inicialização com Valores

Também é possível já definir os valores:

~~~java
int[] numeros = {10, 20, 30, 40, 50};
~~~

---

## Acesso aos Elementos

Cada valor é acessado por meio de um índice:

~~~java
System.out.println(numeros[0]); // primeiro elemento
System.out.println(numeros[2]); // terceiro elemento
~~~

---

## Alteração de Valores

~~~java
numeros[1] = 25;
~~~

---

## Percorrendo um Array

O uso mais comum de arrays é com laços de repetição:

~~~java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
~~~

📌 `numeros.length` indica a quantidade de elementos do array.

---

## Cuidados Importantes

- O índice sempre começa em **0**  
- O tamanho do array é **fixo** após sua criação  
- Acessar posições inválidas gera erro:

~~~java
numeros[5]; // erro
~~~

---

## Resumo

- Arrays armazenam múltiplos valores do mesmo tipo  
- Possuem tamanho fixo  
- São acessados por índice  
- São percorridos geralmente com `for`  


