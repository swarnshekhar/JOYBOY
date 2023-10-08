package searching;
//to geve charracter greater than the target
public class binarysearchqn3 {
    public static void main(String[] args) {
        
        char[]arr={'a','c','e','f','h'};
        char target='h';
        System.out.println(binarysearch(arr, target));
    }


static char binarysearch(char[]arr,char target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
     if(target<arr[mid]){
        end=mid-1;
     }else{
        start=mid+1;
     }

    }
    return arr[start%arr.length];//which is 0 as remainder is zero.condn for modulo.
}
}