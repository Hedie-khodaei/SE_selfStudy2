package session7.mft3;

public class Main {
    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather();

        grandFather.job();

        System.out.println("--------------------------------");

        Father father = new Father();
        father.job();

        System.out.println("----------------------------");

        Man man = new Man();
        man.job();

    }
}
