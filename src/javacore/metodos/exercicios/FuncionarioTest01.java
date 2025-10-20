package javacore.metodos.exercicios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Cleiton");
        funcionario.setIdade(39);
        funcionario.setSalarios(new double[]{2500, 2394, 3400.00});

        funcionario.imprimir();
        System.out.println("Média pelo método getMedia(): R$" + funcionario.getMedia());
    }
}
