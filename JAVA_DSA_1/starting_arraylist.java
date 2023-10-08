package JAVA_DSA_1;

import java.util.ArrayList;
import java.util.Scanner;

public class starting_arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(45);
        list.add(4435);
        list.add(100);
        list.add(425);
        list.add(435);
        list.add(435);
        System.out.println(list);
        System.out.println(list.contains(425));
        System.out.println(list.set(0, 99));
        list.remove(2);
        System.out.println(list);
        // here integer is a rapper class
        // at it's basic
        // ArrayList list1=new ArrayList();
        // but this is not a good practice

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // get item at an index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here

        }
    }
}
