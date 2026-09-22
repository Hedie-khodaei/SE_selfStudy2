package session5;

public class Main2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[]  numbers = new int[100-000-000];

        for (int i = 0; i < 100-000-000; i++) {
            numbers[i] = i + 1;
            //System.out.println(numbers[i]);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+ "Milliseconds");
    }
}
