package session8.mft4;

import java.sql.DriverManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
      //  if (10%2==0)
      //  DriverManager.getConnection("" ,"","");
      try {
          int a =Integer.parseInt("ali");
          int[] numbers = new int[10];
          numbers[11] = 1;

          System.out.println(numbers[1]/0);

      } catch (Exception e) {
          System.out.println("Error" + e.getMessage()+" "+e.getClass());
      }
        System.out.println("end");
    }
}
