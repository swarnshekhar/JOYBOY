package java_dsa_2;

public class linear_search_algorithm {


    
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element== target){
                return index;
            }
        }
        return 0000000;
        //this will return if none will execute
    }
    public static void main(String[] args) {
        //search in th earray if item founfd return index
        // if item not found return_1
        int[]num={12,334,54,54756,67};
        int ans=linearSearch(num, 10000);
        System.out.println(ans);
    }
}
