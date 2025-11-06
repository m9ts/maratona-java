package javacore.heranca.test;

import javacore.heranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da superclasse (Pessoa) é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da subclasse (Funcionario) é executando quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória para o objeto da superclasse (Pessoa)
    // 3 - Cada atributo da superclasse (Pessoa) é criado e inicializado com valores default ou o que for passado da classe pai
    // 4 - Bloco de inicialização da superclasse (Pessoa) é executado na ordem em que aparece
    // 5 - Construtor da superclasse (Pessoa) é executado
    // 6 - Alocado espaço em memória para o objeto da subclasse (Funcionario)
    // 7 - Cada atributo da subclasse (Funcionario) é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse (Funcionario) é executado na ordem em que aparece
    // 9 - Construtor da subclasse (Funcionario) é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ribamar");
    }
}
