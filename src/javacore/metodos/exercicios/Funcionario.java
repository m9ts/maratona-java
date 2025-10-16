package javacore.metodos.exercicios;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println("R$ " + salario);
        }
        imprimeMediaSalario();
    }


    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        media = Math.round(media);
        System.out.println("Média salarial: " + media);
    }
}
