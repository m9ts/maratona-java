package javacore.heranca.dominio;

// Usamos herança quando queremos estender as funcionalidades de uma classe ou quando se quer utilizar polimorfismo
public class Funcionario extends Pessoa {
    private double salario;

    // Sobrescrita
    public void imprime() {
        super.imprime(); // Chamando método da superclasse Pessoa
        System.out.println("Salário: R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
