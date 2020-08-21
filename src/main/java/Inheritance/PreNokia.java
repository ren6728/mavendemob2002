package Inheritance;

public abstract class PreNokia implements SymbianPhone, Max {

    int x=4;
    @Override
    public void call() {
        System.out.println("Calling....");
    }

    @Override
    public void sendText() {
        System.out.println("Sending...");
    }
    public abstract void buildDisplay();
}
