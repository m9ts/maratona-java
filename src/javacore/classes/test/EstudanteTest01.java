package javacore.classes.test;

import javacore.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
//        Variável de referência do tipo Estudante e um objeto do tipo Estudante
        Estudante estudante = new Estudante();
        estudante.nome = "Lou";
        estudante.idade = 22;
        estudante.sexo = 'F';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade + " anos");
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("Endereço de memória: " + estudante);
    }
}
