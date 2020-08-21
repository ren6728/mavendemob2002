package ControlFlowPractice;

public class IfElseDemo {
    public static void main(String[] args) {
        int testscore=76;
        String grade;
        if (testscore>80){
            grade ="B";
        }else if(testscore>=70){
            grade ="C";
        }else if(testscore>=60){
            grade ="D";
        }else {
            grade = "F";
        }
        System.out.println("grade  " + grade);
    }
}
