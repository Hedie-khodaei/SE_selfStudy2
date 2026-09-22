package modifires4.edare;

public class Main3 {

    public static void main(String[] args) {
        Person person = new Person();
        person.publicA =1;
        person.protectedB =2;
        person.defaultC = 3;

        System.out.println(person);
    }
}
