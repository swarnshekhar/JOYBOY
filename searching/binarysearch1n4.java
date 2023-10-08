//doubt
package searching;

import java_dsa_2.search_in_2d;

public class binarysearch1n4 {
    public static void main(String[] args) {

        int[] arr = { 5, 7, 7, 7, 8, 8, 11, 12 };
        int target = 7;
System.out.println(searchrange(arr, target));

    }
    public static int[] searchrange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        int first = search(arr, 0, true);
        int last = search(arr, 0, false);
        ans[0] = first;
        ans[1] = last;

        return ans;
    }

 static int search(int[] arr, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findstartindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
}
