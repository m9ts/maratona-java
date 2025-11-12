package javacore.classes_abstratas.dominio;

// A classe abstrata serve como modelo/template para outras, e não pode ser instanciada diretamente
// Não se pode criar um objeto de Funcionario de forma direta, por exemplo
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método abstrato não possui corpo e é utilizado para ser sobrescrito
    // Métodos abstratos só existem em classes abstratas
    // Classes abstratas podem ter métodos concretos e métodos abstratos
    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
