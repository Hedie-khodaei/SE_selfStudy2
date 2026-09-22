package session6.mft2;

//camelCase (property / method)
//Pscale case  (class)

public class Circle {
      //public porotected (defult) private
  public   void sayHello (String name)    //Method signature  (acsess-modifier output type  name(inputs)
    {                            //Method Body
        int a =1;
      System.out.println("Hello" + name);
    }

    float circleArea(int radius) {
        float area = (float)  radius * radius *3.14f;
        return area;
    }

    Float mohit(int  radius) {
        return   radius * radius *3.14f;

    }
}
