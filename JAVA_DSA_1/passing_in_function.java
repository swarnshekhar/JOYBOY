package JAVA_DSA_1;

import java.util.Arrays;

public class passing_in_function {
    static void change(int[]arr){
       arr[1]=1000;


    }
    public static void main(String[] args) {
        int[]nums={12,34,56,67,77,454};
       System.out.println(Arrays.toString(nums));
       //modify
       change(nums);
       System.out.println(Arrays.toString(nums));
    }
        



    }

