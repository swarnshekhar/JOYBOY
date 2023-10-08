package cyclicsort;

import java.util.Arrays;

public class cyclicsortqn1 {
    public static void main(String[] args) {
        //find the missing number
        int[]arr={1,3,5,4};
        cyclicsort(arr);
                System.out.println(arr);
    }
    static int cyclicsort(int[] arr) {
        int i = 0;
        while (i <= arr.length - 1) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }//search for first missing number
  
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
