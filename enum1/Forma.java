package enum1;
enum TipoForma{
    RETTANGOLO,
    TRIANGOLO
}
public class Forma {
    private TipoForma tipoForma;
    public Forma(TipoForma tipoForma){
        this.tipoForma = tipoForma;
    }

    public TipoForma getTipoForma() {
        return tipoForma;
    }

    public void setTipoForma(TipoForma tipoForma) {
        this.tipoForma = tipoForma;
    }

    public void stampaArea(){
        System.out.print("L'area del ");
    }

}
