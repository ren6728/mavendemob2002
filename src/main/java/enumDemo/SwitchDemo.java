package enumDemo;

public class SwitchDemo {
    public void moodDetector() {
        String activity = "Eatting";
        switch (activity) {
            case "Eatting":
                thingsToDoWhenGood();
                System.out.println("***Good,because i am "+ activity);
                break;
            case "Poor Sleep":
                System.out.println("Bad,because i am "+ activity);
                break;
            case "Lose sth":
                System.out.println("Sad,because i am "+ activity);
                break;
            default:
                System.out.println("I am OK, solo.");
        }

    }
    public void thingsToDoWhenGood(){
        System.out.println("I call friends");
        System.out.println("I shopping");
        System.out.println("I go outside");
    }
}
