package cyclicsort;

import java.util.Arrays;

public class cyclicsortqn3 {
    public static void main(String[] args) {
        //find the missing number
        int[]arr={1,2,2,4};
        System.out.println(cyclicsort(arr));
    }
    static int[] cyclicsort(int[] arr) {
        int i = 0;
        while (i <= arr.length - 1) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //here j is index
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return new int[]{arr[j],j+1};
            }
        }
             return new int[]{-1,-1};

    }//search for first missing number
  
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
