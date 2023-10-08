package searching;

public class binarysearchqn7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 12, 15, 20,19,11,9,7,4};
        
        System.out.println(mountainarray(arr));
    }

    static int mountainarray(int[] arr) {
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
}
