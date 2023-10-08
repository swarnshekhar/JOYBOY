package recursion;

public class digitsum {
    public static void main(String[] args) {
        System.out.println(funsum(1324));
    }
    static int funsum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+funsum(n/10);
    }
}
