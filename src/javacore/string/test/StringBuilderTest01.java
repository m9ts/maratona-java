package javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Mateus";
        nome = nome.concat(" Dev");
        nome = nome.substring(0, 3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Mateus Dev");
        sb.append(" Java").append(" 8");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);

    }
}
