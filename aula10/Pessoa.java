public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String none, int idade) {
        this.nome = none;
        this.idade = idade;
    }

    public void fazAniversario() {
        idade++;
    }

    public void imprime() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}
