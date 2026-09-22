package session5;

import java.util.HashSet;

public class Main6 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("reza");
        names.add("reza");
        names.add("reza");
        names.add("ali");
        names.add("ali");

        System.out.println(names);
         names.remove("ali");
         names.add("mohsen");
         System.out.println(names);

    }
}
