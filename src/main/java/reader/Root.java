package reader;


public class Root {
    private int annoDiInizio;
    private Aula aula;
    private String classe;
    private int numeroFinestre;
    private String specializzazione;
    private Studenti studenti[];
    
    //costruttore senza l'oggetto Studenti
    public Root(int annoDiInizio, Aula aula, String classe, int numeroFinestre, String specializzazione) {
        this.annoDiInizio = annoDiInizio;
        this.aula = aula;
        this.classe = classe;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specializzazione;
    }
    
    //costruttore senza ogetti
    public Root(int annoDiInizio, int numeroFinestre, String specializzazione) {
        this.annoDiInizio = annoDiInizio;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specializzazione;
    }
    
    //costruttore completo
    public Root(int annoDiInizio, Aula aula, String classe,int numeroFinestre, String specializzazione, Studenti[] studenti) {
        this.annoDiInizio = annoDiInizio;
        this.aula = aula;
        this.classe = classe;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specializzazione;
        this.studenti = studenti;
    }
    
    //costruttore senza classe e l'oggetto studenti
    public Root(int annoDiInizio, Aula aula, int numeroFinestre, String specialiazzazione){
        this.annoDiInizio = annoDiInizio;
        this.aula = aula;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specialiazzazione;
    }
    
    //costruttore default
    public Root(){}
    
    public int getAnnoDiInizio() {
        return annoDiInizio;
    }

    public Aula getAula() {
        return aula;
    }

    public String getClasse() {
        return classe;
    }
    
    public int getNumeroFinestre() {
        return numeroFinestre;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public Studenti[] getStudenti() {
        return studenti;
    }
    
    
    
}
