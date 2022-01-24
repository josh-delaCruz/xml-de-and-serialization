package reader;


public class Studenti {
    private int annoDiNascita;
    private String cognome;
    private String nome;

    public Studenti(int annoDiNascita, String cognome, String nome) {
        this.annoDiNascita = annoDiNascita;
        this.cognome = cognome;
        this.nome = nome;
    }
    
    public Studenti(){}

    public int getAnnoDiNascita() {
        return annoDiNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
