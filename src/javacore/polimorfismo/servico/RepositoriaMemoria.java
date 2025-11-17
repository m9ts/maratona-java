package javacore.polimorfismo.servico;

import javacore.polimorfismo.repositorio.Repositorio;

public class RepositoriaMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}
