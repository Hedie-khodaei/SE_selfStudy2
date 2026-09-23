package session8.mft3;

import session8.mft2.Circle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // چهارشنبه  چارشنبه چارشنمبه  WENSDAY داره مثلا روز های هفته رو میگه هرکی یه جور میتونه بنویسه

        WeekDay day =WeekDay.friday;
        System.out.println(day.name());

      //  String d="true";
       // WeekDay day1 =WeekDay.valueOf(d);

        Student student = new Student();
        System.out.println(student.getClass());
        Circle circle = new Circle(10);
        int a =1;
        Float f = 1.1f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("salam");

        // همه چی میتونی بنویسی
        Object object;
       // Object object=circle;
       // Object object=arrayList;
        Object object1 =student;
        Object object2 =circle;

        Circle c2=(Circle)object2;
        //Student student1=(Student)object1;

        System.out.println(object1.getClass());
        System.out.println(object2.getClass());

    }
}
