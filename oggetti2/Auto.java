package oggetti2;

public class Auto {
    private double cilindrata;
    private String targa;
    private String marca;
    private String modello;

    public Auto(double cilindrata, String targa, String marca, String modello){
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public double getCilindrata(){
        return cilindrata;
    }
    public String getTarga(){
        return targa;
    }
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
