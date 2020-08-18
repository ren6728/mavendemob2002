package calculatortest;
import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalTest {
    //public static void main(String[] args) {
    @Test
    public void addTest(){
        Calculator ca=new Calculator();
        int actualresult=ca.add(2,2);
        System.out.println(actualresult);
        int expectresult=4;
        Assert.assertEquals(expectresult,actualresult);
        System.out.println("correct,working fine...");
    }
    @Test
    public void addDeduct(){
        Calculator ca=new Calculator();
        int actualresult=ca.deduct(4,2);
        Assert.assertEquals(2,actualresult);
    }
}
