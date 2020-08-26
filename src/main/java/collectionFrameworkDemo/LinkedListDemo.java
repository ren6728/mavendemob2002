package collectionFrameworkDemo;

import java.util.LinkedList;
public class LinkedListDemo {
        public static void main(String[] args) {
            LinkedList<String> cars = new LinkedList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");

            // Use addFirst() to add the item to the beginning
            cars.addFirst("Mazda");
            System.out.println(cars);
            cars.removeFirst();
            System.out.println(cars);
            System.out.println(cars.getFirst());
            cars.addLast("Mazda");
            System.out.println(cars);
        }
    }


