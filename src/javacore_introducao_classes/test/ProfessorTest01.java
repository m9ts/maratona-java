package javacore_introducao_classes.test;

import javacore_introducao_classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Lulu";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println("Professor: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }
}
