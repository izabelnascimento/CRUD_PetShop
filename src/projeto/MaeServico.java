package projeto;

public abstract class MaeServico {
    private int id;
    private String tipo, produto, valor, emergencia, duracao;

    public MaeServico(int id, String tipo, String produto, String valor, String emergencia, String duracao) {
        this.id = id;
        this.tipo = tipo;
        this.produto = produto;
        this.valor = valor;
        this.emergencia = emergencia;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    } 
}