package Designpatterns_SingletonAndStatic;

public class User {
    private String nome;
    private int eta;

    public User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    public void stampaInformazioniUtente() {
        System.out.println("Nome: " + this.nome + " Eta': " + this.eta);
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
