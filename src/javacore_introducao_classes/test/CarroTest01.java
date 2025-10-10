package javacore_introducao_classes.test;

import javacore_introducao_classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "M4 Competition";
        carro1.ano = 2025;
        carro1.modelo = "Coupé";

        Carro carro2 = new Carro();
        carro2.nome = "Opala";
        carro2.ano = 1976;
        carro2.modelo = "Comodoro";

        // Referência de ojbetos
        carro2 = carro1; // isso só pode ser feito com objetos do mesmo tipo

        System.out.println("----- CARRO ESPORTIVO ----");
        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);

        System.out.println("\n----- CARRO ANTIGO ----");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);

    }
}
