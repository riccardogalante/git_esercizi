package hashmap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> numeri = new HashMap<>();
        numeri.put("Uno", 1);
        numeri.put("Due", 2);
        numeri.put("Tre", 3);
        numeri.put("Quattro", 4);
        numeri.put("Cinque", 5);

        List<Integer> tuttiIValori = new ArrayList<>(numeri.values());

        Collections.sort(tuttiIValori);

        System.out.println("hashmap ordinato: " + tuttiIValori);
    }
}
