package java_dsa_maths_4;

public class maths1_prime {
    public static void main(String[] args) {
        int n=20;
for (int i = 1; i <=n; i++) {
    System.out.println(i +" "+isprime(i));
    
}
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
while(c*c<=n){
    if(n%n==0){
        return false;
    }
    c++;
}
return true;
    }

    }
