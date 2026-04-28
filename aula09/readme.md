<img src="/assets/teste.svg" width="100%">

# Aula 9 - 28/04/2026

# 📘 Revisão para Prova – A1

Este material reúne os principais tópicos que serão cobrados na Avaliação A1.  
Revise cada seção e pratique os exercícios realizados em aula.

---

## 🔹 1. Estruturas Condicionais (`if`, `else if`, `else`)

As estruturas condicionais permitem que o programa tome decisões com base em condições.

### Exemplo:

~~~java
if (media >= 7 && frequencia >= 75) {
    System.out.println("Aprovado");
} else if (media >= 5 && media < 7 && frequencia >= 75) {
    System.out.println("Recuperação");
} else if (frequencia < 75) {
    System.out.println("Reprovado por falta");
} else {
    System.out.println("Reprovado por nota");
}
~~~

### Conceitos importantes:

- Uso de operadores lógicos: `&&` (E), `||` (OU)
- Encadeamento de condições
- Ordem das condições influencia o resultado

---

## 🔹 2. Laços de Repetição (`for`)

O laço `for` é utilizado quando sabemos quantas vezes queremos repetir um bloco de código.

### Estrutura:

~~~java
for (int i = 0; i < 10; i++) {
    // código
}
~~~

### Exemplo com condição:

~~~java
for (int i = 0; i < 20; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
~~~

### Conceitos importantes:

- Inicialização (`int i = 0`)
- Condição (`i < 20`)
- Incremento (`i++`)
- Uso de `%` (módulo) para identificar múltiplos

---

## 🔹 3. Operador Módulo `%`

O operador `%` retorna o resto da divisão inteira.

### Exemplo:

~~~java
10 % 2 → 0   // par
7 % 3 → 1
~~~

### Uso comum:

- Verificar números pares ou ímpares
- Identificar múltiplos

~~~java
if (i % qtde == 0) {
    // i é múltiplo de qtde
}
~~~

---

## 🔹 4. Variáveis e Acumuladores

Um acumulador é uma variável utilizada para somar valores dentro de um laço.

### Exemplo:

~~~java
int soma = 0;

for (int i = 0; i < 10; i++) {
    soma = soma + i;
}
~~~

---

## 🔹 5. Métodos (Modularização)

Métodos permitem dividir o programa em partes menores e organizadas.

### Exemplo:

~~~java
public static int soma(int a, int b) {
    return a + b;
}
~~~

### Uso:

~~~java
int resultado = soma(10, 5);
~~~

### Conceitos importantes:

- **Parâmetros**: valores de entrada do método
- **Retorno (`return`)**: valor devolvido pelo método
- `static`: necessário para chamar dentro da `main`

---

## 🔹 6. Boas Práticas de Nomeação

Nomes claros tornam o código mais fácil de entender.

### ❌ Ruim:

~~~java
int a = 10;
int b = 5;
int c = a + b;
~~~

### ✅ Melhor:

~~~java
int numero1 = 10;
int numero2 = 5;
int soma = numero1 + numero2;
~~~

### Dicas:

- Use nomes que indiquem o propósito da variável
- Evite abreviações confusas
- Métodos devem indicar ação (`calcularMedia`, `somar`)

---

## 🔹 7. Leitura de Código

É importante saber interpretar programas.

### Exemplo:

~~~java
int s = 0;

for (int i = 0; i < 20; i++) {
    if (i % qtde == 0) {
        s = s + i;
    }
}
~~~

📌 Pergunte-se:

- O que o laço faz?
- Qual é a condição?
- Quando a variável é atualizada?
- Qual será o resultado final?

---

## 📌 Dicas para a Prova

- Leia atentamente o enunciado  
- Identifique as condições antes de programar  
- Teste mentalmente seu código  
- Use nomes claros  
- Organize o raciocínio antes de escrever  

---

## 🎯 Objetivo

A prova irá avaliar sua capacidade de:

- construir lógica com condicionais  
- entender e analisar código  
- aplicar laços de repetição  
- escrever código organizado e legível  

---

Bons estudos 🚀