package test.ilpoliformismo1;

public class GestioneForme {
    private Forma[] forme;
    private String nome;
    public GestioneForme(String nome, Forma[] forme) {
        this.nome = nome;
        this.forme = forme;
    }
    public Forma[] getForme() {
        return forme;
    }
    public void setForme(Forma[] forme) {
        this.forme = forme;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void stampaForme(){
        for(Forma forma: forme){
            System.out.println(forma.getNome());
        }
    }
}
