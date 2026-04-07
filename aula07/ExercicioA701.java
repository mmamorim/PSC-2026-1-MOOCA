import java.util.Scanner;

public class ExercicioA701 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtde;

        System.out.println("Digite qtde de números:");
        qtde = leitor.nextInt();

        System.out.println("ok! vc digitou: " + qtde);

        int[] valores = new int[qtde];
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o valor "+(i+1));
            valores[i] = leitor.nextInt();
        }

        System.out.println("Valores digitados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor "+(i+1)+" "+valores[i]);
            soma = soma + valores[i]; 
        }

        System.out.println("Total: "+soma);

    }

}
