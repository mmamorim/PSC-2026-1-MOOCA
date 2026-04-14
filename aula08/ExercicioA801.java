import java.util.Scanner;

public class ExercicioA801 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] produtos = { "Arroz", "Feijão", "Macarrão", "Leite", "Café" };
        double[] precos = { 5.50, 7.20, 4.00, 3.80, 8.90 };
        int codigo = 0;
        int qtde = 0;
        String textoLista = "";

        // MATRIZ IDIOTA SÓ PARA RELAXAR A AULA
        // String letras = "shasjkfhasf asjkfhasjkfhasfhasfj";
        // for(int i=0; i < 10000000; i++) {
        // int pos = (int)(Math.random()*100) % letras.length();
        // System.out.print(letras.charAt(pos));
        // }

        while (codigo >= 0) {
            // IMPRESSÃO DO MENU
            System.out.println("---------------------------");
            System.out.println("MENU DE PRODUTOS");
            System.out.println("---------------------------");
            for (int i = 0; i < produtos.length; i++) {
                System.out.println("" + i + " - " + produtos[i] + " (R$ " + precos[i] + ")");
            }
            System.out.println("---------------------------");
            System.out.println("Digite a opção (-1 p/ SAIR): ");
            codigo = leitor.nextInt();
            if (codigo >= 0) {
                System.out.println("Digite a Qtde: ");
                qtde = leitor.nextInt();

                textoLista = textoLista + "[" + codigo + "] " + produtos[codigo];
                textoLista = textoLista + " " + qtde + " unidades";
                textoLista = textoLista + "\n";
            }
        }

        System.out.println(textoLista);

    }
}
