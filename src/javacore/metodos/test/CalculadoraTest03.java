package javacore.metodos.test;

import javacore.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divideDoisNumeros(20, 0));
        System.out.println(calculadora.divideDoisNumeros02(20, 2));
        System.out.println("---------------");
        calculadora.imprimeDivisaoDeDoisNumeros(50, 0);
    }
}
