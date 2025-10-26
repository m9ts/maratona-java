package javacore.modificador_static.test;

import javacore.modificador_static.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Bayerische Motoren Werke (BMW)", 280);
        Carro carro2 = new Carro("Mercedes-Benz", 275);
        Carro carro3 = new Carro("Audi", 290);

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;


        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
