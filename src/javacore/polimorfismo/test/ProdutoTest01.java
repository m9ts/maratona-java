package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Televisao;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ENIAC", 100000);
        Tomate tomate = new Tomate("Tomate cereja", 6);
        Televisao tv = new Televisao("TCL Full HD 4k", 5000);

        // Polimorfismo em ação: widening casting/upcasting - implícito
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
