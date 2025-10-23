package javacore.construtores.test;

import javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Esporte");
        Anime anime2 = new Anime();

//        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
        anime2.imprime();

    }
}