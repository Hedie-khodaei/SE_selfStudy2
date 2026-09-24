package session8.mft2;

// اگر ابسترکت کلاس دارای پراپرتی و متد بدنه نداشته باشه برای اینکه ارث بری خراب نکنه میتونیم تبدیلش کنیم به اینترفیس
//if abstract class ---> only contains abstract method
public interface  Shape {

   float getArea()throws Exception;

   float getPeremeter()throws Exception;

  // default int add(int a, int b) {
   //   return a + b;


}
