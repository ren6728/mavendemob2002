package ControlFlowPractice;

public class ClassIfElse {
    public static void main(String[] args) {
        int age = 6;  //4
        if(age < 3) {
            System.out.println("Kingdergarden");
        }else if(age > 5){
            System.out.println("Grade2");
        }else if(age > 7){
            System.out.println("Grade3");
        }else if(age > 9){
            System.out.println("Grade4");
        }
        else{
            System.out.println("Grade0");
        }
    }
}
