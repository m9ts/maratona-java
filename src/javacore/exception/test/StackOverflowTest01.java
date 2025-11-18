package javacore.exception.test;

// Exceções são "condições anormais" que desviam o fluxo normal do programa
// Ex.: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException

// Error é uma condição não recuperável em tempo de execução
// Ex.: StackOverflowError, OutOfMemoryError, VirtualMachineError


public class StackOverflowTest01 {
    // Exception in thread "main" java.lang.StackOverflowError
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
