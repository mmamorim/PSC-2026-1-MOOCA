<img src="/assets/teste.svg" width="100%">

# Exercícios - Aula 07 - 07/04

#### Exercício 1 – Soma dos Elementos

> Crie um programa que:
> 
> 1. Leia um inteiro N representando a qtde de números a ser digitados pelo usuário
> 2. Leia N números inteiros e armazene em um array.  
> 2. Calcule a soma de todos os elementos.  
> 3. Exiba o resultado.

#### Exercício 2 – Maior Valor

> Crie um programa que:
> 
> 1. Leia 5 números inteiros.  
> 2. Armazene em um array.  
> 3. Determine o maior valor presente no array.  
> 4. Exiba o maior valor.


#### Exercício 3 – Contagem Acima da Média

> Crie um programa que:
> 
> 1. Leia 5 números reais.  
> 2. Armazene em um array.  
> 3. Calcule a média dos valores.  
> 4. Conte quantos números estão acima da média.  
> 5. Exiba o resultado.

---

## Exercício 4 - Caixa de Supermercado 🛒

Implemente um programa em Java que simule um **caixa de supermercado simples**.

## Produtos Disponíveis

Utilize dois arrays:

- Um array de **nomes dos produtos**
- Um array de **preços dos produtos**

Exemplo:

~~~java
String[] produtos = {"Arroz", "Feijão", "Macarrão", "Leite", "Café"};
double[] precos = {5.50, 7.20, 4.00, 3.80, 8.90};
~~~

Cada produto é identificado pelo seu **índice (código)**.

~~~txt
---------------------------
 0 - Arroz (R$ 5.50)
 1 - Feijão (R$ 7.20)
 2 - Macarrão (R$ 4.00)
 3 - Leite (R$ 5.00)
---------------------------
-1 p/ SAIR e mostrar total
---------------------------
Digite o código do produto? 
~~~

e em seguida, pedir a qtde produto

~~~txt
Digite a qtde do produto?
~~~

Para isso, utilize um **laço de repetição** para permitir múltiplas compras onde em cada iteração:

- Solicite o **código do produto**
- Solicite a **quantidade desejada**

1. Armazene as compras realizadas (produto + quantidade).

2. Permita que o usuário finalize a compra digitando um valor específico (ex: `-1`).

---

## Saída Esperada

Ao finalizar, o programa deve:

1. Listar todos os itens comprados:

Exemplo:

~~~txt
Arroz - 2 unidades x R$ 5.50 TOTAL R$ 11.00
Leite - 3 unidades x R$ 5.00 TOTAL R$ 15.00
------------------
QTDE PRODUTOS: 5
TOTAL: R$ 26.00
~~~

## Regras Importantes

- Validar se o código do produto é válido  
- Permitir apenas quantidades positivas  
- Utilizar arrays para armazenar os dados  
