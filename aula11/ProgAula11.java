public class ProgAula11 {
    
    public static void main(String[] args) {
        Screen.clear();

        Piloto p1 = new Piloto("Abreu");
        Piloto p2 = new Piloto("João");
        Piloto p3 = new Piloto("Felix");

        p2.adicionaHoras(51);
        p3.adicionaHoras(100); 
        p2.adicionaHoras(150);

        p1.imprime();
        p2.imprime();
        p3.imprime();

    }
}
