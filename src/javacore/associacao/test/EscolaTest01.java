package javacore.associacao.test;

import javacore.associacao.dominio.Escola;
import javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Girafales");
        Professor professor2 = new Professor("Epaminondas");
        Professor professor3 = new Professor("Adagoberto");

        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Escola da Vila", professores);

        escola.imprime();
    }
}
