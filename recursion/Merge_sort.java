package recursion;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));// it is exclusive so mid instead of mid+1;
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (left.length > i && right.length > j) {

            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;

            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
        }
        return mix;
    }
}
