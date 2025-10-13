package javacore.metodos.test;

import javacore.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // A variável original não pode ser alterada, o que acontece é uma cópia daquele valor para uma nova varíavel
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("\nDentro de CalculadoraTest04");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
