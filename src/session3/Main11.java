package session3;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {

        //int grade = 21;
       // String strgrade = "21";
       // int grade = Integer.parseInt(strgrade);

       // switch (grade) {
         //   case 1 :
         //       System.out.println("Good");
        //        break;
         //   case 2 :
       //         System.out.println("Middlle");
       //         break;
        //    case 3 :
        //        System.out.println("Bad");
         //       break;
        //    default:
        //        System.out.println("wrong");
        Scanner scanner = new Scanner(System.in);

        String strnum = scanner.nextLine();
        int num = Integer.parseInt(strnum);
        if (num % 2 == 0) {
                 System.out.println("zog");
               }else {
                   System.out.println("fard");
               }

       }
    }

