package session7.mft2;

public class Riazi {
    //over load
    public int add(int aInt, int bTnt) {
        System.out.println("Add Integers 2");
        return aInt + bTnt;
    }
    public int add(int aInt, int bTnt, int cInt) {
        System.out.println("Add Integers 3");
        return aInt +bTnt+cInt;
    }

    public float add(float aFloat, float bFloat) {
        System.out.println("Add Floats");
        return aFloat +bFloat;
    }
    public String add(String aString, String bString) {
        System.out.println("Add Strings");
        return aString +bString;
    }


}
