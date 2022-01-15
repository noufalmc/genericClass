package corejava;

import java.util.Scanner;

public class genericMain {
  public static void main(String[] args)
  {
      maxInteger mi=new maxInteger();
      Scanner sc=new Scanner(System.in);
      String a,b,c;
      System.out.println("Enter the  A and B,C");
      a=sc.nextLine();
      b=sc.nextLine();
      c=sc.nextLine();
      mi.checkMax(a,b,c);
  }
}
