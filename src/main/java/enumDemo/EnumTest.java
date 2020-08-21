package enumDemo;

public class EnumTest {
    Day day;
    public EnumTest(Day day){
        this.day=day;
    }
    public  void useEnum(){
        //Day day=null;
        //Day today=day.FRIDAY;
        //System.out.println(day.FRIDAY);
        switch(day){
            case SATURDAY:
                System.out.println("It's a holiday");
                break;
            case SUNDAY:
                System.out.println("It's weekend,no work");
                break;
            case MONDAY:
                System.out.println("Monday ,let's start work");
                break;
            case TUESDAY:
                System.out.println("This is "+ day.TUESDAY);
                break;
            case WEDNESDAY:
                System.out.println("It's "+ day.WEDNESDAY);
                break;
            case THURSDAY:
                System.out.println("Hey,it's "+ day.THURSDAY);
                break;
            case FRIDAY:
                System.out.println("Haha. it's end of week "+ day.FRIDAY);
                break;
        }
    }
}
