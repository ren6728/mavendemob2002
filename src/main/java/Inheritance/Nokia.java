package Inheritance;

public /*final*/ class Nokia extends PreNokia {
    @Override
    public void buildDisplay() {
        System.out.println("Display...");
    }
    public void takePhoto(){
        System.out.println("Take photo...");
    }

    @Override
    public void phoneBook() {
        System.out.println("phone book...");
    }

    @Override
    public void games() {
        System.out.println("games...");
    }

    @Override
    public void mp3Player() {
        System.out.println("music...");
    }

    public static void main(String[] args) {
        Nokia obj=new Nokia();
        obj.call();
        obj.sendText();
        obj.buildDisplay();
        obj.takePhoto();
       // int x =obj.x;
        //System.out.println(x);
    }
}
