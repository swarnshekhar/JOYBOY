

public class try_catch_block {
    public static void main(String[] args) {
        int a = 6000;
        int b=0;
    

        try {
            int c = a/b;
            System.out.println("the result of a/b is "+ c);
            
        } catch (Exception e) {
            System.out.println("we can't devide bcz");
            System.out.println(e);
        }
System.out.println( " program ends here");
    }

}