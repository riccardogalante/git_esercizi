package test.ilpoliformismo1;

public class Main {
    public static void main(String[] args) {

        Forma[] forme = new Forma[5];

        Forma quadrato = new Quadrato("Quadrato", 4, 5,5);
        Forma rettangolo = new Rettangolo("Rettangolo", 4, 5, 7);
        Forma triangolo = new Triangolo("Triangolo",3, 4, 5);

        forme[1] = quadrato;
        forme[2] = rettangolo;
        forme[3] = triangolo;

        GestioneForme gestioneForme = new GestioneForme("gestore", forme);
        gestioneForme.stampaForme();
    }
}
