package collectionFrameworkDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String>studentInfo=new HashMap<>();
        studentInfo.put(101,"john");
        studentInfo.put(102,"bob");
        studentInfo.put(103,"peter");
        System.out.println(studentInfo.size());
        System.out.println(studentInfo.get(101));
        for (Map.Entry<Integer,String> entry:studentInfo.entrySet()){
            System.out.println("Key: "+ entry.getKey()+" and Value: "+ entry.getValue());
        }
    }
}
