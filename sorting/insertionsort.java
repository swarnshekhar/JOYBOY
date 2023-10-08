package sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
         int[]arr={5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[]arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
            
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
//about insertion sort
//if sorted steps gets reduced as compared to bubble sort.
//used for small value of n,works good if array is partially sorted,it takes part in hybrid sorting algoritms.
