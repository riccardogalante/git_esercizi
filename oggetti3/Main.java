package oggetti3;

public class Main {
    public static void main(String[] args){
        Auto auto1 = new Auto(1200,"32HIJ42","Lamborgingi", "JK7");

        System.out.println("la cilindrata è: "+ auto1.getCilindrata());
        System.out.println("la targa è: "+ auto1.getTarga());
        System.out.println("la marca è: "+ auto1.getMarca());
        System.out.println("il modello è: "+ auto1.getModello());
    }
}
