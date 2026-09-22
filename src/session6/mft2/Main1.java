package session6.mft2;

import session6.Student;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Main1.Circle circle = new Main1.Circle();
        circle.sayHello("ali");


        //call صداکردن
        //invoke  فراخوانی
        // System.out.println(circle.sayHello());
        System.out.println(circle.circleArea(20));
        System.out.println(circle.mohit(10));

        RectAngle rect = new RectAngle();
        System.out.println(rect.mohit(20, 10));

    }

    public static class Circle {
        void sayHello(String name) {
            System.out.println("Hello World");
        }


        float circleArea(int radius){
            float area =   radius * radius * 3.14f;
            return   area;
        }
        float mohit(int  radius){
            return   radius * radius * 3.14f;
        }

    }

    public static class Main2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            //   for (String arg : args) {
             //   System.out.println(arg);

          //  Student s1 = new Student();
            Student s1= new Student("ali","alipour");

            // s1.getAllData( "Ali","alipour");
           // System.out.println(s1.getFullName());
           // System.out.println(s1);

    //        s1.toString();
    //        s1.clone();
    //        s1.notify();
    //        s1.wait();
    //        s1.getClass();
    //        s1.hashCode();


            // s1.setName("ali");
            //  s1.setFamily("alipour");

         //   System.out.println(s1.getName()+" "+s1.getFamily());
        }
    }
}
