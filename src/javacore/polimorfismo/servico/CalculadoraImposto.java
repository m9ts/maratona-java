package javacore.polimorfismo.servico;

import javacore.polimorfismo.dominio.Produto;

public class CalculadoraImposto {
    // Método recebe um Produto, mas aceita objetos de qualquer subclasse (upcasting).
    // Isso permite que o cálculo de imposto seja polimórfico: cada tipo usa sua própria implementação.
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome() + "\nPreço: " + produto.getValor()
                + "\nImposto a ser pago: " + imposto);
    }
}
