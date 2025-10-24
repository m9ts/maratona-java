package javacore.blocos_inicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    {
        // Bloco de inicialização -> executado antes do construtor
        System.out.println("Dentro do bloco de inicialização.");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime() {
        for (int ep : this.episodios) {
            System.out.print(ep + " ");
        }
    }
}
