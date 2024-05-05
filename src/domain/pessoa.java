package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class pessoa {
    // Os atributos abaixo possuem visibilidade 'default', ou seja, de pacote
    String nome;
    String endereco;
    LocalDate nascimento;
    BigDecimal salario;

    public void apresentarse() {
        System.out.println("Nome......: " + this.nome);
        System.out.println("Endereço..: " + this.endereco);
        System.out.println("Nascimento: " + this.nascimento);
        System.out.println("Salário...: " + this.salario);
    }
}
