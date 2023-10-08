package recursion;

public class rverse {
    static int sum=0;
    static void rev(int n){
        if(n==0){
            return;
        }
        sum=sum*10+(n%10);
        rev(n/10);
    }
    public static void main(String[] args) {
        rev(1234);
        System.out.println(sum);
    }
}
