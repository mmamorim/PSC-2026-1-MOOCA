public class Aviao {
    private int qtdeHorasAtiv;

    public Aviao() {
        qtdeHorasAtiv = 0;
    }

    public void fazVoo(int horas, Piloto p ) {
        if (qtdeHorasAtiv <= 200) {
            qtdeHorasAtiv = qtdeHorasAtiv + horas;
            p.adicionaHoras(horas);
        } else {
            System.out.println("PROIBIDO. PRECISA FAZER REVISÃO");
        }
    }

    public void fazRevisao() {
        qtdeHorasAtiv = 0;
    }

    public void imprime() {
        System.out.println("Avião Horas de Ativ:"+qtdeHorasAtiv);
        if (qtdeHorasAtiv > 200) {
            System.out.println("PRECISO DE REVISÃO");
        }
    }
}
