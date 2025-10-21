package javacore.sobrecarga_metodos.test;

import javacore.sobrecarga_metodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.setGenero("Ação");
        anime.imprime();
    }
}
