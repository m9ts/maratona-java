package javacore.associacao.test;

import java.util.Scanner;

public class LeituraDeDadosTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Insira M/F para seu sexo: ");
        char sexo = entrada.next().charAt(0); // pega somente a primeira letra de um array de caracteres

        System.out.println("------------------------");

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);

    }
}
