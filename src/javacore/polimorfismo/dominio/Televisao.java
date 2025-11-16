package javacore.polimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_PERCENTUAL = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    // Sobrescrita do método calcularImposto() da interface Taxavel
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão...");
        return this.valor * IMPOSTO_PERCENTUAL;
    }
}
