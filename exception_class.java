import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString() {
        return "i am tostring()";
    }
    @Override
    public String getMessage() {
        return " i am getmessage()";
    }
}



public class exception_class {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a<9){
            try {
                // throw new myexception();   
                throw new ArithmeticException("this is an exception"); 
                
            } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("finished");
            }
            System.out.println("yes finished");
         }
    }
}
