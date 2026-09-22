package session7.mft2;

public class Main {
    static boolean methodA() {
        System.out.println("methodA");
        return false;
    }
    static boolean methodB() {
        System.out.println("methodB");
        return true;
    }

    public static void main(String[] args) {
        System.out.println(methodA() &&  methodB());
    }
}
