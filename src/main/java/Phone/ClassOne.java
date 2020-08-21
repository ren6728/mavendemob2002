package Phone;

public class ClassOne {
    public static void main(String[] args) {
        int i =0;
        while(i<5){
            System.out.println(i);
            i++;
        }//while loop will execute the code block once, before checking if the condition is true,
        // then it will repeat the loop as long as the condition is true.
        int x=0;
        do{
            System.out.println(x);
            x++;
        }while(x<5);//The loop will always be executed at least once, even if the condition is false,
        // because the code block is executed before the condition is tested:
    }
}
