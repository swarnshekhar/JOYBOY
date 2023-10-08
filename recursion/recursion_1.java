package recursion;

public class recursion_1 {
    public static void main(String[] args) {
        int[]arr={1,2,4,7,23,56,78,79,87,89,90,99,100};
        int target=78;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[]arr,int target,int s,int e){
        while(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;

        }
        if(arr[mid]>target){
            return search(arr, target, mid-1, e);
        }
        return search(arr, target, mid+1, e);
    }
}
