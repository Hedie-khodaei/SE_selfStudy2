package session3;

public class Main4 {
    public static void main(String[] args) {

        int score = 13;

      //  0<score<10 دوتا شرط بشه اینجوری قبول نیست


        if(0 < score & score < 10) {
        //if(0 < score | score < 10) {
       // if(0 < score ! score < 10) {

            System.out.println("Fail");

        }else if(10<= score & score < 12) {
            System.out.println("pass - weak");
        }else if(12<= score & score < 18) {
            System.out.println("pass - normal");
        }else if(18<= score & score < 20) {
            System.out.println("pass - Excellent");
        }else  {
            System.out.println("Invalid score !!!");
        }
    }
}
