package introducao.tipos_primitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, byte, short, long, boolean

        int age = (int) 10000000000L;

        // Casting: é o processo de converter um valor de um tipo de dado para outro
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 77; // ASCII table
        char charUnicode = '\u0043';

        // String é um tipo de referência, e não um tipo primitivo
        String nome = "Jiraya";
        System.out.println("Oi, meu nome é " + nome);

        System.out.println("A idade é " + age + " anos.");
        System.out.println("Char: " + caractere);
        System.out.println(numeroGrande);
    }
}
