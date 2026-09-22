package session3;

public class Main6 {
    public static void main(String[] args) {
        // int a = 1;
        // a = a + 3;
      //  System.out.println(a*1000);
       // int studentCount = 3;
      //  studentCount = studentCount + 2 ;
      //  System.out.println(studentCount);
        //هر حوزه توش بسته بشه garbageاونجا کار میکنه
        int studentCount = 3;
        studentCount = studentCount + 1;
        ++studentCount;
        studentCount += 1;
        studentCount = studentCount - 1;
        studentCount -=1;
        --studentCount;

        studentCount = studentCount + 2;
        studentCount +=2;

        studentCount = studentCount * 2;
        studentCount *=2;

        studentCount = studentCount / 2;
        studentCount /=2;


        System.out.println(studentCount);

    }
}
