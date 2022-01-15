package corejava;

import java.util.Scanner;

public class genericMain {
  public static void main(String[] args)
  {
      maxInteger mi=new maxInteger();
      Scanner sc=new Scanner(System.in);
      int a,b,c;
      System.out.println("Enter the  A and B,C");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      mi.checkMax(a,b,c);
  }
}
