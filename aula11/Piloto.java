public class Piloto {
    private String nome;
    private int qtdeHorasVoo;

    public Piloto(String nome) {
        this.nome = nome;
        qtdeHorasVoo = 0;
    }

    public void adicionaHoras(int qtdeHoras) {
        qtdeHorasVoo = qtdeHorasVoo + qtdeHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome Piloto: " + nome);
        System.out.println("Qtde horas: " + qtdeHorasVoo);
        if (qtdeHorasVoo > 200) {
            System.out.println("COMANDANTE");
        } else {
            System.out.println("CO-PILOTO");
        }
    }
}
