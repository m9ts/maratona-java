package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Romário");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---------------------- JOGADORES ----------------------");
        jogador.imprime();

        System.out.println("---------------------- TIME ----------------------");
        time.imprime();
    }
}
