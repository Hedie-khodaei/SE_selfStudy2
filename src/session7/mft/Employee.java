package session7.mft;

public class Employee {
     String name; // object property
    static String department; // class property

    public static float test(){
        Employee employee = new Employee();
        employee.name = "salam";
        System.out.println(department);
        return 1.0f;
    }
}
