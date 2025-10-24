package javacore.construtores.test;

import javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Esporte", "Production IG");

//        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}