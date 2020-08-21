package Phone;


public class Car extends Vehicle {
     String  modelName="Mustang";

    public static void main(String[] args) {
        Car myFastCar= new Car();
        myFastCar.honk();
        myFastCar.drive();
        System.out.println(myFastCar.brand + "; " +myFastCar.modelName );
        }
    }

