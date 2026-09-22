package session3;

import java.util.Scanner;

public class Tmrin2 {
    public static void main(String[] args) {

        double area, radius;
        String sRadius;
        final double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the radius of area");
        sRadius = sc.nextLine();
        radius = Double.parseDouble(sRadius);
        area = pi / Math.pow(radius, 2);

        if (area < 100) {
            System.out.println("your area is " + area + "\n + you are getting license");

        } else if (area >= 100 && area < 200) {
            System.out.println("your area is " + area + "\n + you will be find");
        } else if (area >= 200) {
            System.out.println("your area is " + area + "\n + your license not be issued to you");
        }else  {
            System.out.println("there is some problem");
        }



    }
}
