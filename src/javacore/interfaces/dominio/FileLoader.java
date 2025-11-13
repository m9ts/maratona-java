package javacore.interfaces.dominio;

// Utiliza-se 'implements' para implementar uma interface
public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo...");
    }
}
