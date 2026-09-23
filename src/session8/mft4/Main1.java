package session8.mft4;

import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("start");
        //  if (10%2==0)
        //  DriverManager.getConnection("" ,"","");
        try {
           // String aa = null;
           // System.out.println(aa.toLowerCase());
           // int a = Integer.parseInt("ali");
          //  int[] numbers = new int[10];
           // numbers[11] = 1;

            System.out.println(10 /0);
        } catch (ArithmeticException e){
        System.out.println("خطا محاسبانی");
    }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }catch (NullPointerException e){
            System.out.println("خطا اندیس غیر مجاز");
        } catch (Exception e) {
            //System.out.println("Error" + e.getMessage()+" "+e.getClass());
            System.out.println("خطا ناشناخته - تماس با ادمین");
        }
        System.out.println("end");
    }
}
