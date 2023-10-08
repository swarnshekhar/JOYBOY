package recursion;

public class rbs {
    public static void main(String[] args) {
        int[]arr={2,3,5,6,8,4,1};
        int target=3;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(arr[s]<=arr[target]&&arr[mid]>=arr[target]){
                search(arr, target, s, mid-1);
            }else{
                search(arr, target, mid+1, e);
            }
        }
        if(target<=arr[e]&&target>=arr[mid]){
            search(arr, target, mid+1, e);
        }
        return search(arr, target, s, mid-1);
    }
}
