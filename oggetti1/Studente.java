package oggetti1;

public class Studente {
    private String nome;

    private String cognome;

    private String id;

    public Studente(String nome, String cognome, String id){
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
