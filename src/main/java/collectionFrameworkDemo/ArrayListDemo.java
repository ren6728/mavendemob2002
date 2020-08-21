package collectionFrameworkDemo;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public void studentList(){
        int [] myArray=new int[5];
        myArray[0]=12;

        List<Integer> studentsIdList = new ArrayList<Integer>();
        String name= new String("john");
        System.out.println(name);
       // ArrayList studentsIdList=new ArrayList<Integer>();
        studentsIdList.add(11);
        studentsIdList.add(12);
        studentsIdList.add(13);
        studentsIdList.add(14);
        studentsIdList.add(null);
        studentsIdList.add(11);
        System.out.println("Element in index 0 : "+ studentsIdList.get(0));
        System.out.println("Length of this List: "+ studentsIdList.size());
        for(int i=0; i<=studentsIdList.size()-1;i++){
            System.out.println("Element index "+ i + ":"+ studentsIdList.get(i));
        }
        for(Integer x: studentsIdList){
            System.out.println(x);
        }
    }
}
