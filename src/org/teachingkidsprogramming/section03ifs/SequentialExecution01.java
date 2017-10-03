package org.teachingkidsprogramming.section03ifs;

public class SequentialExecution01
{
  //looking at Sequential execution, 
  // the order operation run in program
  public static void main(String[] arge)
  {
    System.out.println("In main #1");
    myMethod1();
    System.out.println("In main #2");
  } // end of main method
  public static void myMethod1()
  {
    System.out.println("In myMethod1 #1");
    myMethod2();
  }
  public static void myMethod2()
  {
    System.out.println("In myMethod2 #1");
    myMethod3();
  }
  public static void myMethod3()
  {
    System.out.println("In myMethod3 #1");
    
}// end of class
