package session4;

import java.util.Scanner;
/// برنامه تشخیص عدد اول
public class Main7 {
    public static void main(String[] args) {
        //مقادیر ابتدایی
        Scanner scanner = new Scanner(System.in);
        // اسکنری بساز بره ازکیبورد ورودی بگیره
        // دریافت ورودی از کاربر و تبدیل به عدد صحیح
        int count = 0;
        System.out.print("Enter number:");
        int num = Integer.parseInt(scanner.nextLine()) ;//از ایشون کاربر رشته ای بگیر و ورودی رشته ای به اینتر تبدیل کن
        // شمارش تعداد مقسوم علیه ها
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                System.out.println(i);
                count++;
            }
        }
//        36 % 1 == 0 ==> 1
//        36 % 2 == 0 ==> 2
//        36 % 3 == 0 ==> 3
//        36 % 4 == 0 ==> 4
//        36 % 5 == 0

        //تشخیص عدد اول دارای 2 مقسوم علیه
        System.out.println("count: " + count);
        if (count == 2) {
            System.out.println("prime");
        }else {
            System.out.println("not prime");
       }
    }
}
