package PracticeInheritance;

public class SonClass extends FatherClass {

    public void cherry(){
        System.out.println("lovely cherry..");
    }
    public void cherry(String che){
        //String che="yellow cherry";
        System.out.println(che);;
    }


    @Override
    public void apple() {
        System.out.println("having an apple");
    }

    public static void main(String[] args) {
        SonClass obj=new SonClass();
        obj.banana();
        obj.mango();
        obj.orange();
        obj.watermelon();
        obj.apple();
        obj.cherry();
        obj.cherry("yellow cherry");

    }
}
