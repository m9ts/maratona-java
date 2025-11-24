package javacore.exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo...");
            throw new RuntimeException();
           // System.out.println("Escrevendo dados no arquivo...");
        } catch (Exception e) {
            e.printStackTrace();

            // finally sempre é executado
        } finally {
            System.out.println("Fechando recurso liberado pelo SO.");
        }
        return null;
    }
}
