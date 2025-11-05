package javacore.heranca.test;

import javacore.heranca.dominio.Endereco;
import javacore.heranca.dominio.Funcionario;
import javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Júpiter");
        endereco.setCep("0219031-90");

        Pessoa pessoa = new Pessoa("Alfredo");
        pessoa.setCpf("949249020-49");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("--------------------");

        Funcionario funcionario = new Funcionario("Jubileu");
        funcionario.setCpf("9838281213-28");

        Endereco enderecoFuncionario = new Endereco();
        enderecoFuncionario.setCep("932832-016");
        enderecoFuncionario.setRua("Rua Saturno");

        funcionario.setEndereco(enderecoFuncionario);
        funcionario.setSalario(4500.00);

        funcionario.imprime();
    }
}
