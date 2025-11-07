package javacore.modificador_final.dominio;

public class Carro {
    private String modelo;
    public static final double VELOCIDADE_LIMITE; // O modificador final define uma constante

//    public final double VELOCIDADE_LIMITE;
//
//    public Carro() {
//        VELOCIDADE_LIMITE = 250;
//    }

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
