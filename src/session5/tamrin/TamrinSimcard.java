package session5.tamrin;

import java.util.ArrayList;
import java.util.Scanner;

public class TamrinSimcard {
    public static void main(String[] args) {

        ArrayList<Simcard> Simcards = new ArrayList<>();
        int option;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) Add simCard");
            System.out.println("2) Find by operator");
            System.out.println("3) Total number of owners");
            System.out.println("4) show List of Simcards");
            System.out.println("0) Exit");

            System.out.print("Enter your option: ");
            option = Integer.parseInt(scanner.nextLine());
            System.out.println("---------------------------------------------------");

            if (option == 0) {
                break;
            } else if (option == 1) {
                Simcard simCard = new Simcard();

                System.out.print("Enter id");
                simCard.id = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter operator");
                simCard.operator = scanner.nextLine();

                System.out.println("Enter number");
                simCard.number = scanner.nextLine();

                System.out.println("Enter owner");
                simCard.owner = scanner.nextLine();

                Simcards.add(simCard);
                System.out.println("SimCard added successfully");
                System.out.println("---------------------------------------");

            } else if (option == 2) {
                System.out.println("Under added construction");
                System.out.println("----------------------------------");
            } else if (option == 3) {
                System.out.println("Under added construction");
                System.out.println("------------------------------------------------");
            } else if (option == 4) {
                System.out.println("No simCards found");
                System.out.println("------------------------------------------------");
            } else {
                System.out.println("simCard List : \n");
                for (Simcard simCard : Simcards) {
                    System.out.printf("%5s - %10s %10s %10s \n", simCard.id, simCard.operator, simCard.number, simCard.owner);

                }

                System.out.println("Invalid option");
            }
            System.out.println("--------------------------------");
        }
    }
}




