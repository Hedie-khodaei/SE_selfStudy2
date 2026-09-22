package session8.mft1;

public abstract class Person {

    int a;

    public int add(int a,int b) //    MethodSignature
    {                           //Method Body
        return a+b;
    }

    //method without body
    // implemention --> sub class
    //Force to implement
    public abstract boolean  login(String username,String password);

}
