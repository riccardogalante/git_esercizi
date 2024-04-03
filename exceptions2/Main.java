package exceptions2;
//Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.
public class Main {
    public static void main(String[] args) {
        char ilMioCarattere = '3';
        System.out.println(controlloCarattere(ilMioCarattere));
    }
    public static boolean controlloCarattere(char carattere){
        if(Character.isLetter(carattere)){
            throw new ArithmeticException();
        }else{
            return true;
        }
    }
}
