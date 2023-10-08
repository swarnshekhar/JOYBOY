package java_dsa_2;

public class minm_integer {
    static int min(int[]arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(ans>arr[i]){
                 ans=arr[i];
                 
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={12,13,-1,23,24};
        System.out.println(min(arr));
    }
}
