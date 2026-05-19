
public class TimeFutebol {
    public static final int RETRANCA = 0;
    public static final int ATAQUE = 1;

    private String nome;
    private int qtdeJogos;
    private int pontos;
    private int estilo;

    public TimeFutebol(String nome, int estilo) {
        this.nome = nome;
        this.estilo = estilo;
        pontos = 0;
        qtdeJogos = 0;
    }

    public void venceu() {
        qtdeJogos++;
        pontos = pontos + 3;
    }

    public void empatou() {
        qtdeJogos++;
        pontos++;
    }

    public void perdeu() {
        qtdeJogos++;
    }

    public int getEstilo() {
        return estilo;
    }

    public void imprime() {
        System.out.println("===========");
        System.out.println("TIME: "+nome);
        System.out.println("Pontos: "+pontos);
        System.out.println("Jogos: "+qtdeJogos);
        System.out.println("Estilo: "+estilo);
        System.out.println("===========");
    }

}