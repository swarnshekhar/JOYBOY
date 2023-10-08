package recursion;

import java.util.ArrayList;

import JAVA_DSA_1.array_arraylist;

public class find_target {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 7, 18,18, 9 };
        int target = 18;
        System.out.println(find(arr, 0, target));
        System.out.println(find1(arr, 0, target));
    //    find_all_index(arr, 0, target);
    //    System.out.println(list);
find_all_index1(arr, 0, target, list) ;
System.out.println(list);      

    }

    static int find(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] < target) {
            return find(arr, index + 1, target);
        } else if (arr[index] == target) {
            return index;
        }
        return -1;
    }

    static boolean find1(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find1(arr, index + 1, target);
    }
     static ArrayList<Integer> list=new ArrayList<>();
    static void find_all_index(int[] arr, int index, int target) {
        if (index == arr.length) {
            return ;
        }
         if (arr[index] == target) {
            list.add(index);
        }
        find_all_index(arr, index+1, target);
    }
    static ArrayList<Integer> find_all_index1(int[] arr, int index, int target,ArrayList<Integer>list) {
        if (index == arr.length) {
            return list;
        }
         if (arr[index] == target) {
            list.add(index);
        }
       return find_all_index1(arr, index+1, target, list);
    }
}