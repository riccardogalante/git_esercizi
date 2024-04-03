package leinterfacce1;
public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(10, 3);
        Forma triangolo = new Triangolo(10, 3);

        System.out.println(rettangolo.calcoloArea());
        System.out.println(triangolo.calcoloArea());
    }
}
