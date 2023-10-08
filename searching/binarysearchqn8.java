package searching;

public class binarysearchqn8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 12, 15, 20,19,11,9,7,4};
        int target=15;
    }
    int search(int[]arr,int target){
        int peak=peakindexinMountainArray(arr);
        int firsttry=binarySearch(arr, target, 0, peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return binarySearch(arr, target, peak+1, arr.length-1);
    }
    public int peakindexinMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;// or start both are equal
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
