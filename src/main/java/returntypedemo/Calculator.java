package returntypedemo;

public class Calculator {
    /*public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(2, 3);
        cal.deduct(4, 5);
        System.out.println("Addition : "+cal.add(2,3) + "and" + "Deduct: "+ cal.deduct(4,5));
    }*/

        public int add(int x,int y){
            int result = x + y;
            return result;
        }
        public int deduct(int x, int y){
            int result=x-y;
            return result;
        }
    }

