package ArrayList1;

import java.util.ArrayList;

//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println(students);
        students.add(new Student("Mario", 34));
        students.add(new Student("Luigi", 23));
        students.add(new Student("Giorgio", 53));
        students.add(new Student("Giuseppe", 12));
        System.out.println(students);
    }
}
