package javacore.exception.exception.test;

import javacore.exception.exception.dominio.Leitor1;
import javacore.exception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    // Usando try with resources
    // Usado, geralmente, para abrir e fechar conexão com database
    public static void lerArquivo() {
        // São fechados na ordem inversa da qual foram chamados
        // Leitor2 e depois Leitor1
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2();) {
        } catch (IOException e) {}
    }


    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
