public class methods2 {
    static void foo() {
        System.out.println("good morning shekhar");

    }

    static void foo(int a, int b) {
        a = 3000;
        b = 1800;
        System.out.println("good morning" + a);
        System.out.println("good morning" + b);
    }

    static void tellJoke() {
        System.out.println("joke-->i am gonna give up!");
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int[] array) {
        array[0] = 100;
    }

    public static void main(String[] args) {
        foo();
        foo(0, 0);
        tellJoke();
        int x = 43;
        change(x);
        System.out.println("the value of x after running change is  " + x);
        int []marks={12,34,46,44,46};
        change2(marks);
        System.out.println(marks[0]);

    }
}