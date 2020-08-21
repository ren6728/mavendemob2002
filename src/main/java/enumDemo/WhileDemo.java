package enumDemo;

public class WhileDemo {
    public void useWhileLoop(){
        int age =1;
        while(age>5 && age<7){
            System.out.println("Admit the baby in school.");
            break;
        }
        while (age<5){
            System.out.println("Study at home."+age);
            age++;
        }
    }

}
