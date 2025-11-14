package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ENIAC", 100000);
        Tomate tomate = new Tomate("Tomate cereja", 6);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
