package session4;

import java.time.LocalDate;

public class Main8 {
    public static void main(String[] args) {

        Student student1 = new Student(); // فضای خالی بر اشون باز کرد
        student1.code = 1;
        student1.name = "ali ";
        student1.family = "alipour ";
        student1.birthDate = LocalDate.of(1990, 10, 10);

        Student student2 = new Student(); // فضای خالی بر اشون باز کرد
        student2.code = 2;
        student2.name = " amir ";
        student2.family = "rezaii ";
        student2.birthDate = LocalDate.of(1990, 10, 10);

      //  System.out.println(student2.code + " " + student2.name + " " + student2.family + student2.birthDate + " " + student2.locked);
        System.out.printf("%s - Full Name : %10s %10s - BD : %s - (%s)%n" ,student1.code, student1.name, student1.family, student1.birthDate, student1.locked);
        System.out.printf("%s - Full Name : %10s %10s - BD : %s - (%s)%n" ,student2.code, student2.name, student2.family, student2.birthDate, student2.locked);
    //%d , %f

        //scape character
        // \n    new line
        // \t    tab
        // \r   return to first char of this line

       // System.out.println("\n\t\rd");
      //  System.out.println("a\nb\tc");
        System.out.println("a\nb\tc\rd");

    }
}
