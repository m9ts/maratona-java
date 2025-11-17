package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Aurora", 6000);

        Tomate tomate = new Tomate("Tomate cereja", 10);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
