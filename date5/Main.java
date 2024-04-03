package date5;

import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//Verificare che la prima data è precedente alla seconda
//Verificare che la seconda data è successiva alla prima
//Verificare che le due date sono uguali ad ora
//Stampa il risultato
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        //Verificare che la prima data è precedente alla seconda
        Boolean primaDataPrecedenteAllaSeconda = data1.isBefore(data2);
        System.out.println("la prima data è precedente alla seconda? "+primaDataPrecedenteAllaSeconda);
        //Verificare che la seconda data è successiva alla prima
        Boolean secondaDataSuccessivaAllaPrima = data2.isAfter(data1);
        System.out.println("la seconda data è successiva alla prima? "+secondaDataSuccessivaAllaPrima);
        //Verificare che le due date sono uguali ad ora
        Boolean dateSonoUguali = data1.isEqual(data2);
        System.out.println("data1 e data2 sono uguali? "+dateSonoUguali);
    }
}
