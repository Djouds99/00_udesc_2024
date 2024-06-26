package domain;

// Como a classe Pessoa está dentro do mesmo pacote
// não há necessidade de importá-la

public class TestaPacote {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        // Utilizando métodos get/set
        p.setNome("Zé da Silva");
        System.out.printf("Nome: " + p.getNome());

        // É possível acessar diretamente os atributos
        p.nome = "Zé da Silva";

        System.out.printf("Nome: " + p.nome);
    }
}
