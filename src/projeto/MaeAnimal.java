package projeto;

public abstract class MaeAnimal {
    
    private String tipo,nomea,nomer,contato,CPF,raca,idade,peso;
    private int ID;

    public MaeAnimal(int ID, String tipo, String nomea, String nomer, String contato, String CPF, String raca, String idade, String peso) {
        this.ID = ID;
        this.tipo = tipo;
        this.nomea = nomea;
        this.nomer = nomer;
        this.contato = contato;
        this.CPF = CPF;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomea() {
        return nomea;
    }

    public void setNomea(String nomea) {
        this.nomea = nomea;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}