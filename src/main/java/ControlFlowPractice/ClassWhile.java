package ControlFlowPractice;

public class ClassWhile {
    public static void main(String[] args) {
  int age = 6;
  while(age <5) {
      System.out.println(age);
      age--;
      if (age == -10) {
          break;
      }
  }
    }
}
