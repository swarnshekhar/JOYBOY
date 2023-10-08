package java_dsa_2;

import java.util.Arrays;

public class search_in_2d {
    static int[] search2d(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int cols = 0; cols < arr[row].length; cols++) {
                if (arr[row][cols] == target) {
                    return new int[]{row,cols};
                }
            }

        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9 },
                { 10, 11, 12, 13, 14, 15 }
        };
        int target = 8;
        int[]ans=search2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
