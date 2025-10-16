package javacore.metodos.test;

import javacore.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

//        Chamando o método que contém varargs
        calculadora.somaVarArgs(2, 4, 6, 8, 10, 12, 14);
    }
}
