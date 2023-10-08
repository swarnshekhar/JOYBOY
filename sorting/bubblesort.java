package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[]arr){
        boolean swapped;
        
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
                if(!swapped){
                    break;
                }
                
            }
        }
    }
}
//stable meaning order is maintained...
