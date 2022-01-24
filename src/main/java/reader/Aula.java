package reader;


public class Aula {
    private String nome;
    private int numeroDiBanchi;

    public Aula(String nome, int numeroDiBanchi) {
        this.nome = nome;
        this.numeroDiBanchi = numeroDiBanchi;
    }
    
    //costruttore default
    public Aula(){}

    public String getNome() {
        return nome;
    }

    public int getNumeroDiBanchi() {
        return numeroDiBanchi;
    }
    
    
}
