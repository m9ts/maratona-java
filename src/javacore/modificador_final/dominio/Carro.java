package javacore.modificador_final.dominio;

// A classe Carro não pode ser herdada ao usar final
public class Carro {
    private String modelo;
    public static final double VELOCIDADE_LIMITE = 250; // O modificador final define uma constante

    // Define um atributo público e final do tipo Comprador, inicializado com um novo objeto Comprador.
    // Por ser final, a referência não pode ser alterada depois de criada.
    public final Comprador COMPRADOR = new Comprador();

    // Não é possível sobrescrever um método final
    public final void imprime() {
        System.out.println("Modelo: " + this.modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
