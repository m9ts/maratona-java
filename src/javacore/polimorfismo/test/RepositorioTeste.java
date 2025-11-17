package javacore.polimorfismo.test;

import javacore.polimorfismo.repositorio.Repositorio;
import javacore.polimorfismo.servico.RepositoriaMemoria;
import javacore.polimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

//        List<String> nomes = new ArrayList<>();
//        nomes.add("Endo");
//        nomes.add("Kazemaru");
//        nomes.add("Kabeyama");
    }
}
