package collectionFrameworkDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> emailId=new HashSet<>();
        emailId.add("john@gmail.com");
        emailId.add("peter@yahoo.com");
        emailId.add("bob@hotmail.com");
        emailId.add("john@gmail.com");
        for(String email:emailId){
            System.out.println(email);
        }
    }
}
