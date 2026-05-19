
public class SimulacaoCapeonato {
    
    public static void main(String[] args) {
        Screen.clear();

        TimeFutebol usjtFC = new TimeFutebol("USJT FC", TimeFutebol.ATAQUE);
        TimeFutebol bimboca = new TimeFutebol("BINBOCA FC", TimeFutebol.RETRANCA);
        Campeonato paulistao = new Campeonato("CAMPEONATO PAULISTA");

        paulistao.realizaJogo(usjtFC, bimboca);
        usjtFC.imprime();
        bimboca.imprime();
    }
}
