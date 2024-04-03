package exceptions3;

public class Main {
    public static void main(String[] args) {
        int numero = 3;
        stampaProvaDivisionePerZero(numero);
    }
    public static void stampaProvaDivisionePerZero(int num){
        try{
            int result= num/0;
        }catch (ArithmeticException e){
            System.out.println("Non si può dividere per 0: " + e);
        }finally {
            System.out.println("Finita la gestione degli errori");
        }
    }
}
