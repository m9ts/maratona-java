package javacore.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        // Tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // Wrappers -> objetos
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        // Autoboxing -> transformar tipo primitivo em wrapper
        // Automático pelo Java
        // Ex.: Integer intW = 1;

        // Unboxing -> transformar wrapper em tipo primitivo
        // Ex.: int i = intW;

        // Integer.parseInt transforma String em número
        Integer intW2 = Integer.parseInt("1");

        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println("Character.isDigit: " + Character.isDigit('1'));
        System.out.println("Character.isDigit: " + Character.isDigit('C'));
        System.out.println("Character.isLetterOrDigit: " + Character.isLetterOrDigit('!'));
        System.out.println("Character.isLowerCase: " + Character.isLowerCase('M'));
        System.out.println("Character.toLowerCase: " + Character.toLowerCase('Z'));
        System.out.println("Character.toUpperCase: " + Character.toUpperCase('x'));
        System.out.println("Character.toTitleCase: " + Character.toTitleCase('y'));
        System.out.println("Character.hashCode: " + Character.hashCode('G'));
        System.out.println("Character.hashCode: " + Character.hashCode('g'));

    }
}
