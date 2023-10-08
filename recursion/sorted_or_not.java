package recursion;

public class sorted_or_not {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 8, 12, 14, 18 };
        System.out.println(issorted(arr, 0));
    }

    static boolean issorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1]&&issorted(arr, index+1);

    }
}
