package javacore.classes_abstratas.test;

import javacore.classes_abstratas.dominio.Desenvolvedor;
import javacore.classes_abstratas.dominio.Funcionario;
import javacore.classes_abstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mats", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
