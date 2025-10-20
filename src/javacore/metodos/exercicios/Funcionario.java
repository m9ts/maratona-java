package javacore.metodos.exercicios;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }
//        serve para evitar um erro (NullPointerException) caso o array salarios não tenha sido inicializado antes da execução do método.

        for (double salario : salarios) {
            System.out.println("R$ " + salario);
        }
        imprimeMediaSalario();
    }


    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        media = Math.round(media);
        System.out.println("Média salarial: R$" + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
