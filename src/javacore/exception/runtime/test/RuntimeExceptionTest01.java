package javacore.exception.runtime.test;

// Checked (extends Exception) - exceções lançadas em tempo de compilação
// Problemas externos e recuperáveis | Tratamento obrigatório
// Ex.: IOException

// Unchecked (extends RuntimeException) - exceções em tempo de execução
// Elas representam erros de lógica de programação e não são recuperáveis | Tratamento não obrigatório
// Ex.: ArrayIndexOutOfBounds

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString()); // Exception in thread "main" java.lang.NullPointerException

        int[] nums = {1, 2};
        System.out.println(nums[2]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
    }
}
