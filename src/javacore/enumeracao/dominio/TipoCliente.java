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

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
