package session4;

import modifires4.edare.Person;

import java.time.LocalDate;

public class Main3 {
    public static void main(String[] args) {
      //  int a = 1;
      //  int b = a;
      //  a = 100;
      //  System.out.println(a);
      //  System.out.println(b);

        Student std1 = new Student(); // فضای خالی بر اشون باز کرد
        std1.code = 1;
        std1.name = "ali ";
       std1.family = "alipour ";
        std1.birthDate = LocalDate.of(1990, 10, 10);

        System.out.println(std1.code+" "+std1.name+" "+std1.family+std1.birthDate+ " "+std1.locked);

        std1.name = "alireza";
        System.out.println(std1);




    }
}
