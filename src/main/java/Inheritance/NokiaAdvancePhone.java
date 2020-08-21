package Inheritance;

public class NokiaAdvancePhone extends Nokia {
    public void camero(){
        System.out.println("we can take photos...");
    }
    public void camero(String cameroName){
        System.out.println("we can take photos...");
    }

    @Override
    public void phoneBook() {
        super.phoneBook();
        System.out.println("i am override..");
    }
}
