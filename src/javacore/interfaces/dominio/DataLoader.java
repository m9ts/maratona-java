package javacore.interfaces.dominio;

public interface DataLoader {
    // Todos os atributos em uma interface são final (constante)
    public static final int MAX_DATA_SIZE = 10;

    // Métodos declarados na interface são, por padrão, públicos e abstratos
    void load();

    // 'default' define um método que não impõe um contrato de implementação
    // Método concreto
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface DataLoader.");
    }
}
