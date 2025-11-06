package javacore.heranca.dominio;

// Usamos herança quando queremos estender as funcionalidades de uma classe ou quando se quer utilizar polimorfismo
public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome); // Referenciando o construtor da superclasse Pessoa
        System.out.println("Dentro do construtor de Funcionario");
    }

    // Sobrescrita
    public void imprime() {
        super.imprime(); // Chamando método da superclasse Pessoa
        System.out.println("Salário: R$ " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
