import java.util.Scanner;

public class ExercicioA801 {
    static String[] produtos = { "Arroz", "Feijão", "Macarrão", "Leite", "Café" };
    static double[] precos = { 5.50, 7.20, 4.00, 3.80, 8.90 };

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codigo = 0;
        int qtde = 0;
        String textoLista = "";

        while (codigo >= 0) {

            imprimeCabecalho();
            imprimeOpcoesMenu();
            codigo = lerOpcao();
            

            if (codigo >= 0) {
                
                //System.out.println("Digite a Qtde: ");
                //qtde = leitor.nextInt();
                qtde = lerQtde();

                textoLista = textoLista + "[" + codigo + "] " + produtos[codigo];
                textoLista = textoLista + " " + qtde + " unidades";
                textoLista = textoLista + "\n";
            }
        }

        System.out.println(textoLista);

    }

    // IMPRESSÃO DO MENU
    public static void imprimeCabecalho() {
        System.out.println("---------------------------");
        System.out.println("MENU DE PRODUTOS");
        System.out.println("---------------------------");
    }

    public static void imprimeOpcoesMenu() {
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("" + i + " - " + produtos[i] + " (R$ " + precos[i] + ")");
        }
    }

    public static int lerOpcao() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Digite a opção (-1 p/ SAIR): ");
        int codigo = leitor.nextInt();
        return codigo;
    }
}
