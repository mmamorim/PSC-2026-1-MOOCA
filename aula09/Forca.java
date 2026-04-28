public class Forca {

    public static void main(String[] args) {

        String segredo = "PARALELEPIPEDO";
        
        Screen.clear();
        imprimirTitulo();
        imprimeForca(0);
        imprimeForca(1);
        imprimeForca(2);
        imprimeForca(3);
        imprimeForca(4);
        imprimeForca(5);
        imprimeForca(6);

    }

    public static void imprimirTitulo() {
        System.out.println("+============================+");
        System.out.println("| Jogo da Forca - versão 1.0 |");
        System.out.println("+============================+");
    }

    public static void imprimeForca(int qtdeErros) {
        System.out.println("+---+");
        System.out.println("  |   |");
        if(qtdeErros == 0) {
            System.out.println("      |");
            System.out.println("      |");
        }
        if(qtdeErros > 0) {
            System.out.println("  O   |");
        } 
        if(qtdeErros == 1) {
            System.out.println("      |");
        } 
        if(qtdeErros == 2) {
            System.out.println("  |   |");
        } 
        if(qtdeErros == 3) {
            System.out.println(" /|   |");
        } 
        if(qtdeErros >= 4) {
            System.out.println(" /|\\  |");
        } 
        if(qtdeErros <= 4) {
            System.out.println("      |");
        } 
        if(qtdeErros == 5) {
            System.out.println(" /    |");
        } 
        if(qtdeErros == 6) {
            System.out.println(" / \\  |");
        } 
        System.out.println("=========");   
        System.out.println("QTDE ERROS: "+qtdeErros);   
        System.out.println("");   
    }
}
