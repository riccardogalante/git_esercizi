package ilpoliformismo1;

import test.ilpoliformismo1.Quadrato;

public class Main {
    public static void main(String[] args) {

        Forma rettangolo = new Rettangolo("Rettangolo", 4, 5, 7);
        Forma triangolo = new Triangolo("Triangolo",3, 4, 5);

        rettangolo.stampaArea();
        triangolo.stampaArea();
    }
}
