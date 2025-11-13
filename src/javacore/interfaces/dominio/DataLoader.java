package javacore.interfaces.dominio;

public interface DataLoader {
    // Métodos declarados na interface são, por padrão, públicos e abstratos
    void load();

    // Define um método que não impõe um contrato de implementação
    // Método concreto
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões...");
    }
}
