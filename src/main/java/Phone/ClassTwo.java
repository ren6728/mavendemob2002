package Phone;

public class ClassTwo {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println(i);
        }//Statement 1 is executed (one time) before the execution of the code block.
         //Statement 2 defines the condition for executing the code block.
         //Statement 3 is executed (every time) after the code block has been executed.
        for (int x=0; x<=10; x=x+2){
            System.out.println(x);
        }//it will only print even values between 0 and 10
   String [] cars={"VOLVE","bmw","Ford","Mazda"};
        for(String x : cars){
            System.out.println(x);
        }//a "for-each" loop, which is used exclusively to loop through elements in an array:
         //outputs all elements in the cars array, using a "for-each" loop:
         // Example
    }
}
