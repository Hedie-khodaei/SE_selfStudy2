package session5;

import session4.Student;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main5 {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);

        LinkedList myArrayList1 = new LinkedList();
         // Add To End
        myLinkedList.add("reza");
        myLinkedList.add(myLinkedList);
        myLinkedList.add(1);
        myLinkedList.add(true);
        myLinkedList.add(new Student());
        myLinkedList.add(3.4F);
        myLinkedList.add("ali");
        myLinkedList.add("mohsen");
         //Insert to index
        myLinkedList.add(1,"mohsen");
        System.out.println(myLinkedList);

        //update
        myLinkedList.set(1 ,"alireza");
        //delete
       // myArrayList.remove(0);
        myLinkedList.remove("mohsen");

        System.out.println(myLinkedList);
       //access
        System.out.println(myLinkedList.get(1));

        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }



    }
}
