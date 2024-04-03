package enum1;

public class Triangolo extends Forma{
    private int base;
    private int altezza;
    

    public Triangolo(TipoForma tipoForma, int base, int altezza) {
        super(tipoForma);
        this.base = base;
        this.altezza = altezza;
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
        System.out.println("triangolo è: "+ (base*altezza)/2);
    }
}
