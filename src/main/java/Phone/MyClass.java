package Phone;

public class MyClass {
    public static void main(String[] args) {
        if (20>18){
            System.out.println("20 is greater than 18!");
        }

        int a=20;
        int b=18;
        if (a>b){
            System.out.println("a is greater than b!");
        }
        int time=20;
        if (time<18){
            System.out.println("It's a great day!");
        }else{
            System.out.println("Bad luck!");
        }
        int second=22;
        if(second<10){
            System.out.println("Good morning!");
        }else if(second<20){
            System.out.println("Good day!");
        }else{
            System.out.println("Good evening");
        }
        int t=20;
        String result = (t<18)? "Good boy." : "Good girl." ;
        System.out.println(result);
    }
}
