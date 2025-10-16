package javacore.metodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 10);
    }

    public void multiplicaDoisNumeros(int num, float num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro de alteraDoisNumeros");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("somaArray: " + soma);
    }

    //    Utilizando varargs
    //    O varargs deve ser o último parâmetro para evitar ambiguidade na chamada do método
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("somaVarArgs: " + soma);
    }
}

