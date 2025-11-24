package javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

// Exceções genéricas devem sempre vir ao final do bloco de tratamento de erro
// Ex.: RuntimeException

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
    }
}
