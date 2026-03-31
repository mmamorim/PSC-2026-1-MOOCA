import java.util.Scanner;

public class JogoPalitos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("+---------------------+");
        System.out.println("| Jogo dos palitinhos |");
        System.out.println("+---------------------+");

        int qtdePJ = 3;
        int qtdePC = 3;
        int qtdePJEscolhido = 0;
        int qtdePCEscolhido = 0;
        int qtdePJPalpite = 0;
        int qtdePCPalpite = 0;

        System.out.println("Digite quantos palitos quer separar:");
        qtdePJEscolhido = leitor.nextInt();
        System.out.println("Digite qual seu paltite:");
        qtdePJPalpite = leitor.nextInt();
        qtdePCEscolhido = (int)(Math.random() * 10) % (qtdePC+1);
        qtdePCPalpite = qtdePCEscolhido +  (int)(Math.random() * 10) % (qtdePJ+1);

        System.out.println("qtdePJEscolhido: "+qtdePJEscolhido);
        System.out.println("qtdePCEscolhido: "+qtdePCEscolhido);
        System.out.println("qtdePJPalpite: "+qtdePJPalpite);
        System.out.println("qtdePCPalpite: "+qtdePCPalpite);

        if() {
            System.out.println("Você acertou");
        } else {
            if() {
                System.out.println("Computador acertou");
            } else {
                System.out.println("Ninguém acertou");
            }
        }
    }
}
