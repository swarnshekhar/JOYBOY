package JAVA_DSA_1;

public class new_array {
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int cols = 0; cols < arr[row].length; cols++) {
                System.out.print(arr[row][cols]+" ");
                
            }
            System.out.println();
        }
    }
}
