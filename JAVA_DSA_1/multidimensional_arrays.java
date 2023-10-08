package JAVA_DSA_1;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // inshort we can say it will take a total of 9 elements
        System.out.println(arr.length);// will give no of rows
        // int[][]arr={
        // {1 ,2 ,3},
        // {4 ,5},
        // {6, 7 ,8 ,9}
        // };
        //                        INPUT 
        for (int row = 0; row < arr.length; row++) {
            // now for each cols in every row
            for (int cols = 0; cols < arr[row].length; cols++) {
               arr[row][cols]=sc.nextInt();
            }
        }

        //                        OUTPUT


        //  for (int row = 0; row < arr.length; row++) {
        //     // now for each cols in every row
        //     for (int cols = 0; cols < arr[row].length; cols++) {
        //         System.out.print( arr[row][cols]+" ");
                
        //     }
        //     // dekho agar tum abhi put kroge 9 elements kaise bhi sab ke sab ek line mei aa jayenge matrix ke form mei nhi...iske liye ek new row pr jane se pehle ek new line hona jaruri hai
        //     System.out.println();

//                      OUTPUT KA EK AUR ANOKHA TARIKA
        //  for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
                       
                        //  OUTPUT KA EK AUR TARIKA
 for (int[] a : arr) {
    System.out.println(Arrays.toString(a));
    
 }

        }
    }


