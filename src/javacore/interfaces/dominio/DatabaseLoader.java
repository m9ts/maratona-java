package javacore.interfaces.dominio;

// Utiliza-se 'implements' para implementar uma interface
public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }
}
