package ControlFlowPractice;

public class ForClass {
    public static void main(String[] args) {
        String[] Cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }
        System.out.println("...breaking line");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
