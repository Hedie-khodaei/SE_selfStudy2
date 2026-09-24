package session8.mft4;

import java.util.Locale;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("start");
        //connect ..... database ------ disconnect

        //  if (10%2==0)
        //  DriverManager.getConnection("" ,"","");
        try {
            System.out.println("connect");
           // String aa = null;
           // System.out.println(aa.toLowerCase());
           // int a = Integer.parseInt("ali");
          //  int[] numbers = new int[10];
           // numbers[11] = 1;

            System.out.println(10 /0);
          //  System.out.println("disconnect");
        } catch (ArithmeticException e){
        System.out.println("خطا محاسبانی");
           // System.out.println("disconnect");
    }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("خطا اندیس غیر مجاز");
           // System.out.println("disconnect");
        }catch (NullPointerException e){
            System.out.println("خطا تبدیل عددی");
           // System.out.println("disconnect");
        } catch (Exception e) {
            //System.out.println("Error" + e.getMessage()+" "+e.getClass());
            System.out.println("خطا ناشناخته - تماس با ادمین");
           // System.out.println("disconnect");
        }finally {
            System.out.println("disconnect");
        }

        System.out.println("end");
    }
}
