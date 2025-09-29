package introducao.operadores;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class Operadores {
    public static void main(String[] args) {
//        Operadores aritméticos: Soma (+) | Subtração (-) | Divisão (/) | Multiplicação (*) | Exponenciação (**)
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 - numero02;
//        O resultado da operação matemática entre dois números inteiros é sempre um inteiro
        System.out.println(resultado);

//        Operadores relacionais: Maior que (>) | Menor que (<) | Maior ou igual a (>=) | Menor ou igual a (=<) | Igual a (==) | Diferente de (!=)
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

//        Mod (%) - retorna o resto da divisão entre dois números | Resto 0, número par
        int resto = 20 % 2;
        System.out.println(resto);

//        Operadores lógicos: || (OR) - && (AND)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel);

//        Operadores de atribuição: = (Igual) | +=, -=, *= /=, %= (Atribuição)
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 1800*2 = 3600
        bonus %= 2; // 0

        System.out.println("Bônus: " + bonus);

//      Contador: ++ | --
        int count = 0;
        count += 1;

//      Só funciona de 1 em 1
        count--;
        count++;
        System.out.println(count);

//      Pré-incremento e pré-decremento: ++n e --n
//      Primeiro usa a variável e depois realiza o incremento ou decremento

        int count2 = 0;
        System.out.println("Pós-incremento: " + count2++);

//      Pós-incremento e pós-decremento: n++ e n--
        int count3 = 0;
        System.out.println("Pré-incremento: " + ++count3);
    }
}
