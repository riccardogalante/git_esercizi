package leclassiastratte;

import javax.swing.plaf.IconUIResource;

public class Rettangolo extends Forma{
    private int lato;
    private int altezza;

    public Rettangolo(int lato, int altezza) {
        this.lato = lato;
        this.altezza = altezza;
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void stampaArea() {
        System.out.println("L'area del rettangolo è: "+lato * altezza);
    }
}
