package javacore.enumeracao.dominio;

// Enum é um tipo especial de classe que representa um conjunto fixo e constante de valores.
// Cada valor do enum é uma instância única e imutável, usada para representar estados, categorias ou opções predefinidas.
// Resumo: use enum quando as opções forem limitadas, conhecidas e imutáveis.
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    // Atributo que guarda o índice numérico de cada tipo de cliente
    private int indice;

    /**
     * Retorna o tipo de cliente correspondente ao índice informado.
     *
     * @param indice valor numérico associado a um tipo de cliente
     * @return o TipoCliente que possui o mesmo índice, ou null se não encontrar
     */
    public static TipoCliente tipoClienteIndice(int indice) {
        // values() retorna um array com todos os valores do enum TipoCliente
        // Aqui, percorremos cada tipo de cliente definido no enum
        for (TipoCliente tipoCliente : values()) { //
            // Compara o índice recebido com o índice do tipo atual
            if (tipoCliente.getValor() == indice) {
                return tipoCliente; // Retorna o tipo correspondente
            }
        }
        return null; // Nenhum tipo encontrado com esse índice
    }

    /**
     * Retorna o tipo de cliente com base no nome usado em relatórios.
     *
     * @param nomeRelatorio nome do tipo de cliente conforme aparece em relatórios
     * @return o TipoCliente que tem o mesmo nome de relatório, ou null se não encontrar
     */
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        // values() também retorna todos os valores possíveis do enum
        // Assim, podemos comparar cada um com o nome informado
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente; // Retorna o tipo correspondente
            }
        }
        return null; // Nenhum tipo encontrado com esse nome
    }

    // OBS.: values() é usado para percorrer todos os tipos de cliente e encontrar aquele que
    // tem o índice ou o nome de relatório correspondente

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
