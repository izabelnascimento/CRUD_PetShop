
package projeto;

public abstract class MaeProduto {
    
    private String marca, tipo, valor, validade, quantidade;
    private int id;
    
    public MaeProduto(int id, String marca, String tipo, String valor, String validade, String quantidade){
        
        this.id = id;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
        this.validade = validade;
        this.quantidade = quantidade;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}