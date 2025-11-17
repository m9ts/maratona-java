package javacore.polimorfismo.servico;

import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    // Recebe um Produto, permitindo que objetos de subclasses também sejam usados (polimorfismo).
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");

        double imposto = produto.calcularImposto(); // Chama a versão específica da subclasse
        System.out.println("Produto: " + produto.getNome() +
                            "\nPreço: " + produto.getValor() +
                            "\nImposto a ser pago: " + imposto);

        // Se for um Tomate, realiza o downcasting para acessar métodos específicos da subclasse.
        if (produto instanceof Tomate) {
            ((Tomate) produto).getDataValidade(); // Método exclusivo de Tomate
        }
    }
}
