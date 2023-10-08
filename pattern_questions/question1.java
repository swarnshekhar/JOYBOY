package pattern_questions;

public class question1 {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("");

        pattern2(5);

        System.out.println();

        pattern3(5);

        System.out.println();
        pattern4(5);
    }

    static void pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int cols_in_row;
            if (i > n) {
                cols_in_row = 2 * n - i - 1;
            } else {
                cols_in_row = i;
            }
            for (int j = 1; j <= cols_in_row; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}