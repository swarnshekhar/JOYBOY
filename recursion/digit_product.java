package recursion;

public class digit_product {
    public static void main(String[] args) {
        System.out.println(diggysum(2236));
    }
    static int diggysum(int n){
        if((n%10)==n){
            return n;
        }
        return (n%10)*diggysum(n/10);
      
    }
}
