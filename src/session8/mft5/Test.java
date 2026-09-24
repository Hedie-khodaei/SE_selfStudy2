package session8.mft5;

public class Test {

    public int add(int a, int b) {
        return a + b;
    }

    //unit test
    public void testAdd() throws Exception {
        if (add(1,2) !=3) {
            throw new Exception("متد جمع درست کار نمیکنه!!!!");
        }else{
            System.out.println("Test Pssed");
        }

    }
}
