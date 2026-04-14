import java.util.Scanner;

public class ExercicioA801 {
    static String[] produtos = { "Arroz", "Feijão", "Macarrão", "Leite", "Café" };
    static double[] precos = { 5.50, 7.20, 4.00, 3.80, 8.90 };

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codigo = 0;
        int qtde = 0;
        String textoLista = "";
        double total = 0;

        while (codigo >= 0) {
            Screen.clear();
            System.out.println("----------------");
            System.out.println("LISTA DE COMPRAS");
            System.out.println("----------------");
            System.out.println(textoLista);
            System.out.println("----------------");

            imprimeCabecalho();
            imprimeOpcoesMenu();
            codigo = lerOpcao();

            if (codigo >= 0) {
                qtde = lerQtde();
                total = total + precos[codigo] * qtde;
                textoLista = textoLista + gerarLinhaCompra(codigo,qtde);
            }
        }

        System.out.println(textoLista);
        System.out.println("TOTAL DA COMPRA: R$"+total);


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

    public static int lerQtde() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a Qtde: ");
        int qtde = leitor.nextInt();
        return qtde;
    }

    public static String gerarLinhaCompra(int codigo, int qtde) {
        String textoLista = "";
        double total = precos[codigo] * qtde;
        textoLista = textoLista + "[" + codigo + "] " + produtos[codigo];
        textoLista = textoLista + " " + qtde + " unidades";
        textoLista = textoLista + " SUBTOTAL: R$" + total;
        textoLista = textoLista + "\n";
        return textoLista;
    }
}
