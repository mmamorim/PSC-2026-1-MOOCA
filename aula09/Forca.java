import java.util.Scanner;

public class Forca {
    public static String segredo = "PARALELEPIPEDO";
    public static String lacunas = "_____________";

    public static void main(String[] args) {
        int qtdeErros = 0;
        char letra;

        while (qtdeErros < 6) {
            Screen.clear();
            imprimirTitulo();
            imprimeForca(qtdeErros);
            System.out.println("SEGREDO: " + lacunas);
            System.out.println("");
            letra = lerLetra();
            System.out.println("Letra escolhida foi: " + letra);
            boolean acertou = verificaLetraSegredo(letra);
            if(!acertou) {
                qtdeErros++;
            }
        }

    }

    public static void imprimirTitulo() {
        System.out.println("+============================+");
        System.out.println("| Jogo da Forca - versão 1.0 |");
        System.out.println("+============================+");
    }

    public static void imprimeForca(int qtdeErros) {
        System.out.println("+---+");
        System.out.println("  |   |");
        if (qtdeErros == 0) {
            System.out.println("      |");
            System.out.println("      |");
        }
        if (qtdeErros > 0) {
            System.out.println("  O   |");
        }
        if (qtdeErros == 1) {
            System.out.println("      |");
        }
        if (qtdeErros == 2) {
            System.out.println("  |   |");
        }
        if (qtdeErros == 3) {
            System.out.println(" /|   |");
        }
        if (qtdeErros >= 4) {
            System.out.println(" /|\\  |");
        }
        if (qtdeErros <= 4) {
            System.out.println("      |");
        }
        if (qtdeErros == 5) {
            System.out.println(" /    |");
        }
        if (qtdeErros == 6) {
            System.out.println(" / \\  |");
        }
        System.out.println("=========");
        System.out.println("QTDE ERROS: " + qtdeErros);
        System.out.println("");
    }

    public static char lerLetra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UMA LETRA: ");
        String linha = sc.nextLine();
        char letra = linha.toUpperCase().charAt(0);
        return letra;
    }

    public static boolean verificaLetraSegredo(char letra) {
        String novaLacunas = "";
        boolean acertou = false;
        for (int i = 0; i < segredo.length(); i++) {
            if (letra == segredo.charAt(i)) {
                novaLacunas = novaLacunas + letra;
                acertou = true;
            } else {
                novaLacunas = novaLacunas + "_";
            }
        }
        lacunas = novaLacunas;
        return acertou;
    }
}
