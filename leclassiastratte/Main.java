package leclassiastratte;

public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(3,5);
        Forma triangolo = new Triangolo(2,5);

        rettangolo.stampaArea();
        triangolo.stampaArea();
    }
}
