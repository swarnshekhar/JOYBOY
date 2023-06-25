package folder;


class calculator{
    public void calculate(int a,int b){
        System.out.println("your result is "+a+b);
    }
}
class sccalculator{
    public void calculate(int a,int b){
        System.out.println("your result is: "+ Math.sin(a+b));
    }
}
class hybridcalculator{
    public void calculate(int a,int b){
        System.out.println("your result is "+ Math.sin(a+b));
        System.out.println("your result is "+a+b);

    }
}
public class problem2 {
    public static void main(String[] args) {
        System.out.println("i am main method");
    }
}
