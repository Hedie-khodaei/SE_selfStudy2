package session5;

public class Main1 {
        public static void main(String[] args) {
                String [] names = new String[3];
                names[0] = "John";
                names[1] = "Jane";
                names[2] = "John";
            //    names[3] = "Jane";
//                System.out.println(names[0]);
//                System.out.println(names[1]);
//                System.out.println(names[2]);

                for (int i = 0; i < 3; i++) {
                        System.out.println("Hello" + names[i]);

                }
              // System.out.println("Hello" + names); //این روش نوشتن غلطه بالایی درسته
        }


}
