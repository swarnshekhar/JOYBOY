package searching;

public class binarysearchqn6 {
    public static void main(String[] args) {
        
    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            
            }else if(arr[mid]<target){
                start=mid+1;

            }
        }
        return end;
    }
}
