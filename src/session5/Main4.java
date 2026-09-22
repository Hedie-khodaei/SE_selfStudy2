package session5;

import session4.Student;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList();

        myArrayList.add(1);
        myArrayList.add(2);

        ArrayList myArrayList1 = new ArrayList();
         // Add To End
        myArrayList.add("reza");
        myArrayList.add(myArrayList);
        myArrayList.add(1);
        myArrayList.add(true);
        myArrayList.add(new Student());
        myArrayList.add(3.4F);
        myArrayList.add("ali");
        myArrayList.add("mohsen");

         //Insert to index
        myArrayList.add(1,"mohsen");
        System.out.println(myArrayList);

        //update
        myArrayList.set(1 ,"alireza");
        //delete
       // myArrayList.remove(0);
        myArrayList.remove("mohsen");

        System.out.println(myArrayList);
       //access
        System.out.println(myArrayList.get(1));

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }



    }
}
