package javacore.metodos.test;

import javacore.metodos.dominio.Estudante;
import javacore.metodos.dominio.ImprimeEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impEst = new ImprimeEstudante();

        estudante01.nome = "Mario";
        estudante01.idade = 25;
        estudante01.sexo = 'M';

        estudante02.nome = "Peach";
        estudante02.idade = 22;
        estudante02.sexo = 'F';

        System.out.println("Usando this: ");
        estudante01.imprime();
        estudante02.imprime();
    }
}
