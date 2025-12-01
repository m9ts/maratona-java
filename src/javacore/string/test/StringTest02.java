package javacore.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Zen";
        String numeros = "012345";
        String rmv = "         Remove espaço       ";

        System.out.println("nome.charAt(): " + nome.charAt(0));
        System.out.println("Tamanho do array de caracteres 'nome': " + nome.length());
        System.out.println("nome.replace(): " + nome.replace("e", "o"));
        System.out.println("nome.toLowerCase(): " + nome.toLowerCase());
        System.out.println("nome.toUpperCase(): " + nome.toUpperCase());
        System.out.println("numeros.length(): " + numeros.length());
        System.out.println("numeros.substring(): " + numeros.substring(0,2)); // o segundo índice é exclusivo (valor - 1)
        System.out.println("numeros.substring(3, numeros.length()): " + numeros.substring(3, numeros.length()));
        System.out.println("rmv.trim(): " + rmv.trim());
    }
}
