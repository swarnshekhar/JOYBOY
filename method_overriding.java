class A{

    public int a;

 public int swarn(){
    return 4;
 }
public void meth2(){
    System.out.println("i am methOD 2 of class A");
}


}

class B extends A{
    public void meth2(){
    System.out.println("i am methOD 2 of class B");
}
 public void meth3(){
    System.out.println("i am meth3 of class B");
}
}







public class method_overriding {
    public static void main(String[] args) {

        A a = new A();
        B b=new B();
        a.meth2();
        b.meth2();
        
    }
    
}
