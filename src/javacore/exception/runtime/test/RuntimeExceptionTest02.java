package javacore.exception.runtime.test;

// Exceções do tipo RuntimeException não possuem tratamento obrigatório
// mas é recomendável tratar com try/catch, throw
public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(5, 0);
    }

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            // Lançando exceção
            throw new IllegalArgumentException("Argumento ilegal. Não pode ser 0!");
        }
        return a / b;
    }
}
