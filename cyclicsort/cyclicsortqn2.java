package cyclicsort;

import java.util.Arrays;

public class cyclicsortqn2 {
    public static void main(String[] args) {
        int[]arr={1,3,4,2,2};
        // cyclicsort(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(cyclicsort(arr));
    }
    static int cyclicsort(int[] arr) {
        int i = 0;
        while (i <= arr.length - 1) {
            if(arr[i]!=i+1){
                int correct = arr[i];
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);

            } else {
                return arr[i];
            }
        }else{
          i++;
   
        }
    }
    return -1;
}

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
