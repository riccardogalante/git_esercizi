package test.ilpoliformismo1;

public class Rettangolo extends Forma{
    private int numeroLati;
    private int base;
    private int altezza;

    public Rettangolo(String nome, int numeroLati, int base, int altezza) {
        super(nome);
        this.numeroLati = numeroLati;
        this.base = base;
        this.altezza = altezza;
    }
    public int getNumeroLati() {
        return numeroLati;
    }
    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltezza() {
        return altezza;
    }
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
    @Override
    public void stampaArea() {
        super.stampaArea();
        System.out.println("L'area del rettangolo è: " + base * altezza);
    }
}
