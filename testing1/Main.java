package testing1;
//Riprendi uno degli esercizi già svolti e corretti
//Aggiungi Junit al progetto
//Crea una funzione di test che non dia errori
public class Main {
    public static void main(String[] args) {

    }
    public static Integer somma(Integer a,Integer b){
    if(a == null && b == null){
        throw new ArithmeticException("Questa operazione contiene null quindi non è eseguibile");
    }
        return a + b;
    }
}
