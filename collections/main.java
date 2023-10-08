package OOPs.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Stack();
        list2.add(34);
        list2.add(78);
        list2.add(55);
        list2.add(29);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(55);
        vector.add(67);
        vector.add(89);
        System.out.println(vector);
    }
}
