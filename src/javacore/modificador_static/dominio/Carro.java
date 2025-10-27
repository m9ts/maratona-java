package javacore.modificador_static.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    // O modificador static referencia um atributo ou método que pertence à classe em si
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("--------------");
        System.out.println("Nome: " + this.nome + "\nVelocidade máxima: " + this.velocidadeMax + "\nVelocidade limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    // Métodos estáticos não usam this
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
