<img src="/assets/teste.svg" width="100%">

# Aula 2 - 10/03/2025


## Estrutura da Classe Principal em Java

Todo programa em Java é organizado dentro de **classes**. Diferente de outras linguagens onde é possível escrever código solto, em Java absolutamente tudo deve estar dentro de uma classe.

A estrutura mínima de uma classe principal é a seguinte:

~~~java
public class Main {

    public static void main(String[] args) {
        // código do programa começa aqui
    }

}
~~~

Vamos entender cada parte dessa estrutura.

### 1. `public class Main`

- **public** → indica que a classe pode ser acessada por outras partes do programa.  
- **class** → palavra-chave usada para declarar uma classe.  
- **Main** → nome da classe.

📌 **Importante:**  
O nome da classe deve ser **igual ao nome do arquivo**, incluindo letras maiúsculas e minúsculas.  
Se o arquivo se chama `Main.java`, a classe obrigatoriamente deve se chamar `Main`.

---

### 2. Bloco da classe `{ }`

As chaves `{ }` delimitam o corpo da classe.  
Tudo que pertence à classe deve estar dentro dessas chaves, como por exemplo:

- métodos  
- atributos (variáveis da classe)  
- construtores  
- outros blocos de código  

---

### 3. O método `main`

Dentro da classe principal existe um método especial:

~~~java
public static void main(String[] args)
~~~

Esse método é o **ponto de entrada do programa**.  
Quando executamos o programa, a JVM procura exatamente por esse método para iniciar a execução.

Sem o método `main`, o programa não executa.

---

### Estrutura da Linguagem Java

<p align="justify">
A seguir, apresentamos de forma resumida os recursos linguisticos básicos do Java.
</p>

#### Comentários

<p align="justify">
Os comentários podem ser descritos de duas formas gerais: 
</p>

~~~java
// comentário de uma única linha

/* comentário de uma 
   ou mais linhas 
   ...
/*
~~~


## Regras de Nomeação de Identificadores

Em Java, **identificadores** são os nomes dados aos elementos do programa, como:

- classes  
- métodos  
- variáveis  
- atributos  
- pacotes  

Para que o código seja válido, esses nomes devem seguir algumas regras da linguagem.

---

### 1. Caracteres permitidos

Um identificador pode conter:

- letras (a–z, A–Z)  
- números (0–9)  
- underline `_`  
- cifrão `$`  

Exemplos válidos:

~~~java
int idade;
double salarioMensal;
String nome_completo;
int valor$produto;
~~~

---

### 2. Não pode começar com número

O identificador **não pode iniciar com dígito**.

❌ Inválido:

~~~java
int 1idade;
double 2024Salario;
~~~

✔️ Válido:

~~~java
int idade1;
double salario2024;
~~~

---

### 3. Não pode conter espaços

Identificadores devem ser escritos sem espaços.

❌ Inválido:

~~~java
String nome completo;
int valor total;
~~~

✔️ Válido:

~~~java
String nomeCompleto;
int valorTotal;
~~~

---

### 4. Palavras reservadas não podem ser usadas

Java possui palavras com significado próprio na linguagem, chamadas **palavras-reservadas**.

Exemplos:

- `class`
- `public`
- `static`
- `void`
- `int`

❌ Inválido:

~~~java
int class;
double public;
~~~

---

### 5. Java é Case Sensitive

A linguagem diferencia maiúsculas de minúsculas.

~~~java
int idade;
int Idade;
int IDADE;
~~~

Os três são identificadores diferentes.

---

## Boas Práticas de Nomeação

Embora não sejam obrigatórias, seguem convenções adotadas no mercado:

- **Classes** → PascalCase → `MinhaClasse`
- **Variáveis e métodos** → camelCase → `salarioMensal`
- **Constantes** → MAIÚSCULAS → `VALOR_MAXIMO`

Seguir essas convenções torna o código mais legível e profissional.


#### Estilo e organização

<p align="justify">
Os blocos de código são demarcados entre chaves <b>{ }</b> e ao final de cada instrução deverá ser usado o <b>;</b> (ponto e vírgula). A linguagem Java é <b>Case Sensitive</b>, isto é, significa que o compilador irá fazer a diferenciação entre letras maiusculas e minusculas. 
</p>

<p align="justify">
Toda classe em Java deverá ser definida com o mesmo nome do arquivo (<b>.java</b>), sendo adotado como padrão que o primeiro caractere de todas as palavras que compõem o identificador da classe deve ser maiúsculo. 

> **Exemplos:** 
> `Pessoa`, `ContaCorrente` e `TimeDeFutebol` 

Os Métodos, Atributos e Variáveis adotam como padrão o primeiro caracter minúsculo e demais palavras iniciando com Maiusculas.  

> **Exemplos:** 
> `media`, `calculaMedia()` e `codigoVip` 

Já as constantes devem adotar o padrão com todos os caracteres maiúsculos e divisão de palavras utilizando \_. 

> **Exemplos:** 
> `AZUL`, `AZUL_CLARO`
</p>

#### Tipos de Dados

<p align="justify">
Em Java, como em outras linguagens fortemente tipadas, toda variável deve ser declarada descrevendo o tipo da informação a ser armazenada. 
</p>

> `<tipo> <identificador>;`
> `<Tipo> <identificador> = valor;`
> `<Tipo> <identificador> = valor, <identificador> = valor... ;`


<p align="justify">
A Tabela 1.1. apresenta alguns tipos primitivos da linguagem Java. As variáveis definas para esses tipos armazenam o valor diretamente no espaço alocado em memória. As variáveis do tipo referência armazenam o endereço de memória para um determinado valor ou objeto, que dependendo da informação e execução do programa, pode ter espaço de memória variável, como por exemplo, o tipo <b>String</b> que será descrito mais adiante. 
</p>

| Tipo Java | Tipo de dado | Tamanho em Bytes |
| -- | -- | -- |
| **`int`** | inteiro | 4 |
| **`byte`** | inteiro 0 até 255 | 1 |
| **`long`** | inteiro longo | 8 |
| **`float`** | real | 4 |
| **`double`** | real longo | 8 |
| **`boolean`** | lógico | 1 |
| **`char`** | 1 caractere | 2 |

<p align="center">
Tabela 1.1. Tipos primitivos Java.
</p>

<p align="justify">

Os valores literais que representam uma informação do tipo `float`  devem receber o caractere `f` após a informação. Exemplos: `100.0f`, `5.34f` e `3.1416f`.
</p>

#### Operadores

<p align="justify">

Os operadores **aritméticos** na linguagem Java adotados são:

| Operador | Descrição |
| -- | -- |
| + | soma |
| - | subtração |
| * | multiplicação |
| / | divisão |
| % | resto da divisão (mod) |
| ++ | incremento |
| -- | decremento |
</p>


## Comandos de Leitura e Escrita

O Java disponibiliza diversas classes que manipulam a entrada e saída básicas para ler e escrever em arquivos, envio de dados via rede e o **console** (Console é o nome dado a janela de linha de comandos também conhecida como **prompt (Windows)** ou **terminal (Linux)**. 

A classe ```System``` disponibiliza o acesso para a saída e entrada padrão por meio do ```System.out``` e ```System.in``` respectivamente. Estes pacotes oferecem métodos de impressão e leitura usados para manipular dados em um programa no console.


### Saída de Dados

O pacote de classes ```System.out``` oferece dois métodos básicos para impressão. O ```print``` para apresentar dados na tela sem quebra de linha e ```println``` para apresentar dados na tela com quebra de linha ao final da impressão.

~~~java
int qtde = 5; 
System.out.print("Tenho " + qtde + " amigos."); 
double valor = 1.55;
System.out.print("Tenho apenas R\$:" + valor);
~~~

### Leitura de Dados

O Java disponibiliza a classe ```Scanner``` do pacote ```java.util```. Essa classe implementa as operações de entrada de dados pelo teclado no ```console```. 

Para utilizar a classe ```Scanner``` deve-se importar o respectivo pacote, adicionando a linha ```import java.util.Scanner;``` no início do arquivo de código. Além disso, deve-se instanciar um objeto desta classe, conforme apresentado no exemplo abaixo.

~~~java
import java.util.Scanner; \\

class TesteLeitura { \
    public static void main(String args[]) {
         Scanner leitor = new Scanner(System.in); 
         System.out.println("Informe uma idade:");
         int n = leitor.nextInt();
         System.out.println("Valor da idade digitada: "+n);
    }
}
~~~

A leitura dos diversos tipos diferentes é apresentada pela tabela abaixo. 

| Método | Tipo de dado | Exemplo |
| -- | -- | -- |
| nextInt() | inteiro | int n = leitor.nextInt(); |
| nextDouble() | double | double n = leitor.nextDouble(); |
| next() | String (uma palavra) | String n = leitor.next(); |
| nextLine() | String (linha inteira) | String n = leitor.nextLine(); |

Enquanto ```leitor.next()``` é usado na leitura de palavras simples, ou seja, não são separados pelo caractere de espaço, o comando ```leitor.nextLine()``` é usado na leitura de palavras compostas, como por exemplo, ```"oi gente"```.

