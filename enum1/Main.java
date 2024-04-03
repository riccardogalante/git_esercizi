package enum1;
//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma specifica.
//Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.
public class Main {
    public static void main(String[] args) {
        Forma triangolo = new Triangolo(TipoForma.TRIANGOLO,2,5);
        Forma rettangolo = new Rettangolo(TipoForma.RETTANGOLO,2,5);
        triangolo.stampaArea();
        rettangolo.stampaArea();
    }
}
