package exceptions4;
//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e gestista sia l'eccezione
//della divisione che quella di indice non presente nell'array, leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.
public class Main {
    public static void main(String[] args) {
        int[] arrayDiInteri = {1,2,3,4,5,6};
        stampaElementoArrayDivisoZero(arrayDiInteri, 8);
    }
    public static void stampaElementoArrayDivisoZero(int[] array, int index){
        try{
            int divisione = array[index]/0;
        }catch (ArithmeticException e){
            System.out.println("L'indice dell'array non può essere diviso per 0: "+ e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("L'indice inserito non è presente nell'array: "+ e);
        }
    }
}
