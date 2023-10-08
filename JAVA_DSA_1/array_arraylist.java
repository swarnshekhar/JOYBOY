package JAVA_DSA_1;

import java.util.Arrays;
import java.util.Scanner;

public class array_arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] rlns1 = new int[5];
        rlns1[0] = 34;
        rlns1[1] = 44;
        rlns1[2] = 344;
        rlns1[3] = 334;
        rlns1[4] = 67;

        String[] array = new String[3];
        // or other way
        int[] rlns2 = { 23, 24, 34, 456, 4 };
        // int[]ros= just declaration of variable in stack happens at compile time
        // ros=new int[4];= inilisatio of adding thing in stack...actuallly creating
        // object in heap memory happens at runtime

        // array objects are in heap and heap objects are not continuous in allocation
        // via blocks
        // hence java objects may or may not be continuous...as it depends on jvm...as
        // bcz of heap memory allocation
        // heap is a runtime area where all the data objects are allocated
        // new is used to create an object

        System.out.println(rlns1[3]);
        System.out.println(rlns1[0]);
        System.out.println(rlns1[2]);

        for (int i = 0; i < rlns2.length; i++) {
            
            // shortcut fori
            rlns2[i] = sc.nextInt();
        }
            // System.out.print(rlns2[i]+" ");
            // System.out.print(Arrays.toString(rlns2));

//modify
            rlns2[1]=1000;
            System.out.println(Arrays.toString(rlns2));



            // or u may also do but it will make it lenthy
        
            // for (int num : rlns2) {
            //     // for each as shortcut
            //     System.out.println(num + " ");
            // }

        }

    }


