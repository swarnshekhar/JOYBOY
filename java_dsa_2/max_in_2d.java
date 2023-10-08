package java_dsa_2;

import java.util.Arrays;

public class max_in_2d {
    static int search2d(int[][] arr) {
        int max=Integer.MIN_VALUE;
        // for (int row = 0; row < arr.length; row++) {
        //     for (int cols = 0; cols < arr[row].length; cols++) {
        //         if (arr[row][cols] >max) {
        //             max=arr[row][cols];
                    for (int[] hii : arr) {
                        //arr mei se sare content ko traverse kro....jisko mei element or here hii naam de rha hu
                        for (int elements : hii) {
                            if(elements>max){
                                max=elements;
                            }
                        }
                        
                    }
                
            

        
        return max;
        }
    

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9 },
                { 10, 11, 12, 13, 14, 15 }
        };
        int target = 8;
        System.out.println(search2d(arr));
        System.out.println(Integer.MIN_VALUE);
    }
}

