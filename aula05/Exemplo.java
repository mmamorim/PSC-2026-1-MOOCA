import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto;

        System.out.println("Digite um texto:");
        texto = leitor.nextLine();
        System.out.println("Você digitou: "+texto);
        int qtdeLetras = texto.length();
        System.out.println("O texto tem: "+qtdeLetras+" letras");
        System.out.println("A primeira letra é: "+texto.charAt(0));
    }
}
