package PracticeInheritance;

public abstract class FatherClass implements ParentClass, GrandparentClass {
    @Override
    public void banana() {
        System.out.println("sugarfree, sugar...");
    }

    @Override
    public void mango() {
        System.out.println("mango juice...");
    }

    @Override
    public void orange() {
        System.out.println("orange pie...");
    }
    public void watermelon(){
        System.out.println("sweet watermelon...");
    }
    public abstract void apple();

    @Override
    public void papaya() {

    }
}
