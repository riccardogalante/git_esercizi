package ilpoliformismo1;

public class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void stampaArea(){
        System.out.println("area della forma");
    }
}
