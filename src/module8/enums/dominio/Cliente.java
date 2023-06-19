package module8.enums.dominio;

public class Cliente {



    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamemto tipoPagamemto;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamemto tipoPagamemto) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamemto = tipoPagamemto;
    }

    public String getNome() {
        return nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public TipoPagamemto getTipoPagamemto() {
        return tipoPagamemto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.VALOR +
                ", tipoPagamemto=" + tipoPagamemto +
                '}';
    }
}
