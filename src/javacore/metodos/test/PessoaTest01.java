package javacore.metodos.test;

import javacore.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Roberto");
        pessoa.setIdade(3);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
    }
}
