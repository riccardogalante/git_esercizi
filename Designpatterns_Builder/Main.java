package Designpatterns_Builder;
//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        BuilderPerson builder = new BuilderPerson();

        builder.setAddress("Piazza seconda 5");
        builder.setFirstName("Ferdinando");
        builder.setLastName("Scozzese");
        builder.setAge(37);

        Person primaPersona = builder.build();
        System.out.println("Prima persona: "+ primaPersona);

        Person secondaPersona = new Person("Luis","Gonzales",23,"Via Vittorio Emanuele 65");
        System.out.println("SecondaPersona: "+ secondaPersona);
    }
}
