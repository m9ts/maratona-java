package javacore.modificador_final.test;

import javacore.modificador_final.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("Velocidade limite (km/h): " + Carro.VELOCIDADE_LIMITE);
    }
}
