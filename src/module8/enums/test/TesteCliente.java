package module8.enums.test;

import module8.enums.dominio.Cliente;
import module8.enums.dominio.TipoCliente;
import module8.enums.dominio.TipoPagamemto;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Emanoel", TipoCliente.PESSOA_FISICA, TipoPagamemto.CREDITO);
        Cliente cliente2 = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA, TipoPagamemto.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
