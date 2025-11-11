package javacore.enumeracao.test;

import javacore.enumeracao.dominio.Cliente;
import javacore.enumeracao.dominio.TipoCliente;
import javacore.enumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mateus", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Adagoberto", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("Desconto no débito (%): " + TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println("Desconto no crédito (%): " + TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente1 = TipoCliente.tipoClienteIndice(1);
        System.out.println("Tipo do cliente pelo índice (1): " + tipoCliente1);

        TipoCliente tipoCliente2 = TipoCliente.tipoClienteIndice(2);
        System.out.println("Tipo do cliente pelo índice (2): " + tipoCliente2);

        TipoCliente tipoCliente3 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println("Tipo do cliente por nome (PF): " + tipoCliente3);

        TipoCliente tipoCliente4 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
        System.out.println("Tipo do cliente por nome (PJ): " + tipoCliente4);

    }
}
