package javamemorydemo;

public class Car {
    String color;//primitive variable
    int numOfCar;
public Car(String color,int numOfCar){
    color=this.color;
    numOfCar=this.numOfCar;
}
    public static void main(String[] args) {
        getCar();
        //Car();
        System.out.println("hello");
    }
    public static Car getCar(){
        Car blueCar=new Car("blue",3);
        return blueCar;
        //System.out.println(blueCar);
    }
}
