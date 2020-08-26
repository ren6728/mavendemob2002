package Inheritance;

public interface Max {
    public void mp3Player();
    public void games();
    default public void vedio(){
        System.out.println("hi..");
    }
}
