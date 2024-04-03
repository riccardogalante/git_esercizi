package autoboxingeunboxing1;
//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
public class Main {
    public static void main(String[] args) {
        int numero1 = 10;
        double ilMioDouble1 = 7.0;
        char ilMioCarattere1 = 'a';
        //autoboxing
        Integer integer1 = numero1;
        Double double1 = ilMioDouble1;
        Character carattere1 = ilMioCarattere1;

        Integer integer2 = 15;
        Double double2 = 29.0;
        Character carattere2 = 'f';
        //unboxing
        int numero2 = integer2;
        double ilMioDouble2 = double2;
        char ilMioCarattere2 = carattere2;
        stampaSommaInt(numero1, numero2);
        stampaCarattereChar(ilMioCarattere2);
        stampaSommaInteger(integer1, integer2);
        stampaCarattereCharacter(carattere1);

    }
    public static void stampaSommaInt(int num1, int num2){
        int somma = num1 + num2;
        System.out.println("La somma dei due numeri int è: "+somma);
    }
    public static void stampaCarattereChar(char carattere){
        System.out.println("Il char è: "+carattere);
    }
    public static void stampaSommaInteger(Integer num1, Integer num2){
        Integer somma = num1 + num2;
        System.out.println("La somma dei numeri Integer è: "+ somma);
    }
    public static void stampaCarattereCharacter(Character carattere){
        System.out.println("Il Character è: "+ carattere);
    }
}
