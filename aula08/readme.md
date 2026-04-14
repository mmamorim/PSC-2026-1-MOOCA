<img src="/assets/teste.svg" width="100%">

# Aula 8 - 14/04/2026

## Modularização com Métodos em Java

À medida que os programas crescem, organizar o código se torna essencial.  
Uma forma de fazer isso é utilizando **métodos**, que funcionam como “funções”.

Um método permite **separar o código em partes menores**, facilitando:

- leitura  
- reutilização  
- manutenção  

---

## Estrutura de um Método

~~~java
static tipoRetorno nomeMetodo(parametros) {
    // código
}
~~~

### Exemplo

~~~java
static void mensagem() {
    System.out.println("Olá!");
}
~~~

---

## Chamando um Método

Para executar um método, basta chamá-lo pelo nome:

~~~java
mensagem();
~~~

---

## Métodos com Parâmetros

Os métodos podem receber valores como entrada, chamados de **parâmetros**:

~~~java
static void saudacao(String nome) {
    System.out.println("Olá, " + nome);
}
~~~

Chamada:

~~~java
saudacao("Maria");
~~~

---

## Métodos com Retorno

Um método também pode **retornar um valor** utilizando a palavra-chave `return`.

~~~java
static int soma(int a, int b) {
    return a + b;
}
~~~

Chamada:

~~~java
int resultado = soma(5, 3);
System.out.println(resultado);
~~~

---

## Método `void`

Quando o método não retorna nenhum valor, utilizamos `void`:

~~~java
static void exibirMensagem() {
    System.out.println("Sem retorno");
}
~~~

---

## Exemplo Completo

~~~java
public class Main {

    public static void main(String[] args) {
        int resultado = soma(10, 5);
        System.out.println(resultado);
    }

    static int soma(int a, int b) {
        return a + b;
    }
}
~~~

---

## Resumo

- Métodos ajudam a **organizar o código**  
- Podem receber **parâmetros**  
- Podem **retornar valores** (`return`)  
- `void` indica que não há retorno  
- Devem ser declarados com `static` para serem usados dentro da `main`  

👉 A modularização torna os programas mais claros e reutilizáveis.