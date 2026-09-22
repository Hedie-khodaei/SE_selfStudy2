package session3;

public class Tamrin3 {
    public static void main(String[] args) {
        int sum = 0 , i , count = 0 , result;

        for (i = 100; i < 1000; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                count++;
            }
        }
        result = sum /count;
        System.out.println("THE avrage of the three-digit odd number is equal to " + result);
    }
}
