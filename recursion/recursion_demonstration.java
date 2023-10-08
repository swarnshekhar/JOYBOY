package recursion;
//to print hello india 5 times...
public class recursion_demonstration {
    // RECURSION means to call itself...
    public static void main(String[] args) {
        // message1();
        print(1);
    }
    static void message1(){
        System.out.println("hello india");
        message2();
    }
    static void message2(){
        System.out.println("hello india");
        message3();
    }
    static void message3(){
        System.out.println("hello india");
        message4();
    }
    static void message4(){
        System.out.println("hello india");
        message5();
    }
    static void message5(){
        System.out.println("hello india");
    }
    //             or or or or or or or or or or or or or or or or or or or or or or or 
    static void print(int n){
        if(n==5){
            System.out.println("hello india");
            return;
        }
        System.out.println("hello india");
        print(n+1);
    }
}
