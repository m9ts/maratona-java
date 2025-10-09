package javacore_introducao_classes.test;

import javacore_introducao_classes.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("-----------------");

        Estudante estudante02 = new Estudante();

        estudante02.nome = "Perry";
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
    }
}
