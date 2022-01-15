package corejava;

import java.util.Scanner;

public class genericMain {
  public static void main(String[] args)
  {
      maxInteger mi=new maxInteger();
      Scanner sc=new Scanner(System.in);
      float a,b,c;
      System.out.println("Enter the  A and B,C");
      a=sc.nextFloat();
      b=sc.nextFloat();
      c=sc.nextFloat();
      mi.checkMax(a,b,c);
  }
}
