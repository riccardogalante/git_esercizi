package bigdecimal;

import java.math.BigDecimal;

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione,moltiplicazione e divisione, min e max)
//definita in un enum
//Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
public class Main {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(2);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(7);
        Operazioni operazione = Operazioni.ADDIZIONE;
        BigDecimal risultato = calcoloOperazioen(bigDecimal1, bigDecimal2, Operazioni.ADDIZIONE);

        System.out.println("Primo numero: "+bigDecimal1);
        System.out.println("Secondo numero: "+bigDecimal2);
        System.out.println("Tipo di operazione: "+operazione);
        System.out.println("Risultato dell'operazione: "+risultato);
    }
    private static BigDecimal calcoloOperazioen(BigDecimal val1, BigDecimal val2, Operazioni operazione){
        switch (operazione){
            case ADDIZIONE -> {
                return val1.add(val2);
            }
            case SOTTRAZIONE -> {
                return val1.subtract(val2);
            }
            case MOLTIPLICAZIONE -> {
                return val1.multiply(val2);
            }
            case DIVISIONE -> {
                return val1.divide(val2);
            }
            case MINIMO -> {
                return val1.min(val2);
            }
            case MASSIMO -> {
                return val1.max(val2);
            }
            default -> throw new IllegalArgumentException("Operazione non eseguibile "+operazione);
        }
    }
}
