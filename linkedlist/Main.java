package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata
public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("mango"));
        fruits.add(new Fruit("papaja"));
        System.out.println(fruits);

        fruits.addFirst(new Fruit("banana"));
        fruits.addLast(new Fruit("fragola"));
        System.out.println(fruits);

    }
}
