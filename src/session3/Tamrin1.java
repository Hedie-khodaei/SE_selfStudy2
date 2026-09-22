package session3;

import java.util.Scanner;

public class Tamrin1 {
    public static void main(String[] args) {
        double Height , Weight ,bmi ;
        String sHeight , sWeight ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height (m))");
        sHeight = scanner.nextLine();
        Height = Double.parseDouble(sHeight);
        System.out.println("Enter your weight (kg):");
        sWeight = scanner.nextLine();
        Weight = Double.parseDouble(sWeight);

        bmi = Weight / Math.pow(Height, 2);
        if (bmi >= 18.5) {
            System.out.println("Your BMI is " + bmi + "\n you are under weight");
        } else if (bmi <= 18.5 && bmi < 25) {
            System.out.println("Your BMI is " + bmi + "\n you are normall");
        } else if (bmi >25) {
            System.out.println("Your BMI is " + bmi + "\n you are overweight");
        }else {
            System.out.println("there is some problem");
        }
    }
}
