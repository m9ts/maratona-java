package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Vegetti");
        Time time = new Time("Vasco da Gama");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
