package javacore.classes_abstratas.dominio;

// A classe abstrata serve como modelo/template para outras, e não pode ser instanciada diretamente
// Não se pode criar um objeto de Funcionario de forma direta, por exemplo
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
