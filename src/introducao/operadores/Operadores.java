package introducao.operadores;

public class Operadores {
    public static void main(String[] args) {
//        Operadores aritméticos: Soma (+) | Subtração (-) | Divisão (/) | Multiplicação (*) | Exponenciação (**)
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 -  numero02;
//        O resultado da operação matemática entre dois números inteiros é sempre um inteiro
        System.out.println(resultado);

//        Operadores relacionais: Maior que (>) | Menor que (<) | Maior ou igual a (>=) | Menor ou igual a (=<) | Igual a (==) | Diferente de (!=)
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);

//        Mod (%) - retorna o resto da divisão entre dois números | Resto 0, número par
        int resto = 20 % 2;
        System.out.println(resto);
    }
}
