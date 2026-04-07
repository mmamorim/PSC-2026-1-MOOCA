import java.io.IOException;
import java.util.Scanner;

public class JogoPalitos {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("+---------------------+");
        System.out.println("| Jogo dos palitinhos |");
        System.out.println("+---------------------+");

        int rodada = 0;
        int qtdePJ = 3;
        int qtdePC = 3;
        int qtdePJEscolhido = 0;
        int qtdePCEscolhido = 0;
        int qtdePJPalpite = 0;
        int qtdePCPalpite = 0;

        while (qtdePJ > 0 && qtdePC > 0) {
            rodada++;
            System.out.println("********************");
            System.out.println("RODADA "+rodada);
            System.out.println("Vc tem "+qtdePJ+" palitos no total");
            System.out.println("Computador tem "+qtdePC+" palitos no total");
            System.out.println("********************");

            System.out.println("Digite quantos palitos quer separar:");
            qtdePJEscolhido = leitor.nextInt();
            System.out.println("Digite qual seu paltite:");
            qtdePJPalpite = leitor.nextInt();
            qtdePCEscolhido = (int) (Math.random() * 10) % (qtdePC + 1);
            qtdePCPalpite = qtdePCEscolhido + (int) (Math.random() * 10) % (qtdePJ + 1);

            System.out.println("qtdePJEscolhido: " + qtdePJEscolhido);
            System.out.println("qtdePCEscolhido: " + qtdePCEscolhido);
            System.out.println("qtdePJPalpite: " + qtdePJPalpite);
            System.out.println("qtdePCPalpite: " + qtdePCPalpite);

            if (qtdePJPalpite == qtdePCEscolhido + qtdePJEscolhido) {
                System.out.println("❤️ Você acertou ❤️");
                qtdePJ--;
            } else {
                if (qtdePCPalpite == qtdePCEscolhido + qtdePJEscolhido) {
                    System.out.println("😡 Computador acertou 😡");
                    qtdePC--;
                } else {
                    System.out.println("Ninguém acertou");
                }
            }

        }

        if(qtdePJ == 0) {
            System.out.println("Vc GANHOU!");
        } else {
            System.out.println("COMPUTADOR GANHOU!");
        }
        System.out.println("GAME OVER");
        
    }
}
