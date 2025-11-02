package javacore.associacao.exercicio;

public class Main {
    public static void main(String[] args) {
        Local local = new Local("Rua Netuno");

        Aluno aluno = new Aluno("Mitz", 20);
        Aluno aluno1 = new Aluno("Tyla", 23);

        Professor professor = new Professor("Eyk", "Pesquisador científico");

        Aluno[] alunosSeminario = {aluno, aluno1};

        Seminario seminario = new Seminario("'Compreendendo como funcionam os planetas do Sistema Solar'", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
