package recursion;

public class countzeroes {
    public static void main(String[] args) {
        System.out.println(count(120024024));
    }
     static int count(int n) {
        return czero(n, 0);
    }
     private static int czero(int n,int z){
        if(n==0){
            return z;
        }
     int rem=(n%10);
     if(rem==0){
        return czero(n/10, z+1);
     }
     return czero(n/10, z);
    }
}
