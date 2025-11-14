package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        // Variável de referência do tipo Produto
        // Objeto real de Computador
        Produto produto = new Computador("Aurora Alienware", 15000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("------------------------");

        // A variável produto2 é do tipo Produto, então só pode acessar métodos que existem em Produto
        // O objeto real é um Tomate
        Produto produto2 = new Tomate("Tomate verde", 7);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

        if (produto2 instanceof Tomate) { // Verifica se o objeto realmente é um Tomate
            // Se for, faz o downcast para Tomate, podendo acessar
            // métodos exclusivos da subclasse
            ((Tomate)produto2).getDataValidade();
        }
    }
}
