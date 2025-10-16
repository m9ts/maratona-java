package javacore.metodos.exercicios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Cleiton";
        funcionario.idade = 39;
        funcionario.salarios = new double[]{2500, 2394, 3400.00};

        funcionario.imprimir();
    }
}
