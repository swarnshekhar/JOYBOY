package java_dsa_2;

public class search_in_range {
    static int searchrange(int[]arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
            
        }for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(target==element){
                return index;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[]arr={12,123,-1,23,24,243};
        int target=-1;
        int start=1;
        int end=4;
        System.out.println(searchrange(arr, target, start, end));
    }
}
