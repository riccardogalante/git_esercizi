package ArrayList2;

import java.util.ArrayList;
import java.util.Comparator;

//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mario", 21));
        students.add(new Student("Gonzales", 23));
        students.add(new Student("Francesco", 25));
        students.add(new Student("Riccardo", 26));
        students.add(new Student("Filippo", 32));
        students.add(new Student("Peppe", 78));
        students.add(new Student("Cartano", 32));
        students.add(new Student("Nicola", 65));
        students.add(new Student("Rebecca", 87));
        students.add(new Student("Vincenzo", 23));
        students.add(new Student("Ignazio", 12));
        students.add(new Student("Astolfo", 42));
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);
    }
}
