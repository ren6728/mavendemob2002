package Phone;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String userName;
        //// Enter username and press Enter
        System.out.println("Enter userName");
        userName=obj.nextLine();
        System.out.println("UserName is : " + userName);
    }
}
