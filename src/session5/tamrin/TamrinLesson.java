package session5.tamrin;

import java.util.ArrayList;
import java.util.Scanner;

public class TamrinLesson {
    public static void main(String[] args) {

         int Choice;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Lesson> lessonlist = new ArrayList<>();

        while (true) {
            System.out.println("1)Add lesson");
            System.out.println("2)Find lesson By Teacher");
            System.out.println("3)Sum of Lesson Ceof");
            System.out.println("0)Exit");


            System.out.print("Enter your choice :");
            Choice = Integer.parseInt(scanner.nextLine());
            System.out.println("------------------------------------");

            if (Choice == 0) {
                break;
            } else if (Choice == 1) {
                Lesson lesson = new Lesson();

                System.out.print("Eenter  id :");
                lesson.id = Integer.parseInt(scanner.nextLine());


                System.out.print("Eenter title :");
                lesson.title = scanner.nextLine();

                System.out.print("Eenter Lesson teacher :");
                lesson.teacher = scanner.nextLine();

                System.out.print("Eenter ceof :");
                lesson.ceof = Integer.parseInt(scanner.nextLine());

                lessonlist.add(lesson);
                System.out.println("Lesson added successfully");

            } else if (Choice == 2) {
                System.out.println("Lesson found");
            } else if (Choice == 3) {
                System.out.println("under Construction");
        }else {
                    System.out.println("Lesson List : \n");
                    for (Lesson lesson : lessonlist) {
                        System.out.printf("%4s - %10s %10s %10s \n", lesson.id, lesson.title, lesson.teacher, lesson.ceof);
                    }

                System.out.println("Invalid option");
            }
            System.out.println("---------------------------------------------------");
        }

    }
}
