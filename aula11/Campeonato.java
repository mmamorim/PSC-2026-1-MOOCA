public class Campeonato {
    private String nome;
    private int qtdeJogos;

    public Campeonato(String nome) {
        this.nome = nome;
        qtdeJogos = 0;
    }

    public void realizaJogo(TimeFutebol timeCasa, TimeFutebol timeVisitante) {

        if(timeCasa.getEstilo() == TimeFutebol.RETRANCA && timeVisitante.getEstilo() == TimeFutebol.ATAQUE) {

        }

    }
}
