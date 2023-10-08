package java_dsa_maths_4;

public class maths2 {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        prime2(n, primes);
    }

    static void prime2(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == false) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[i] = true;

                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.println(i + "");
            }
        }

    }
}
