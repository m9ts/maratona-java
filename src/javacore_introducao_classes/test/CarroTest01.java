package javacore_introducao_classes.test;

import javacore_introducao_classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carroEsportivo = new Carro();
        carroEsportivo.nome = "M4 Competition";
        carroEsportivo.ano = 2025;
        carroEsportivo.modelo = "Coupé";
        System.out.println("----- CARRO ESPORTIVO ----");
        System.out.println("Nome: " + carroEsportivo.nome + "\nModelo: " + carroEsportivo.modelo + "\nAno: " + carroEsportivo.ano);

        Carro carroAntigo = new Carro();
        carroAntigo.nome = "Opala";
        carroAntigo.ano = 1976;
        carroAntigo.modelo = "Comodoro";
        System.out.println("\n----- CARRO ANTIGO ----");
        System.out.println("Nome: " + carroAntigo.nome + "\nModelo: " + carroAntigo.modelo + "\nAno: " + carroAntigo.ano);
    }
}
