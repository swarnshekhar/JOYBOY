abstract class parent2 {
    public parent2() {
        System.out.println("mai ek container hu");
    }

    public void sayhello() {
        System.out.println("hello");
    }

    abstract public void greet();
}

class child2 extends parent2 {
    @Override
    public void greet() {
        System.out.println("good morning");
    }
}

 abstract class child3 extends parent2 {

    public void th() {
        System.out.println("i am good");
    }
}

public class abstract_s {
    public static void main(String[] args) {
         //Parent2 p = new Parent2(); -- error
        //Child3 c3 = new Child3(); -- error
        child2 c = new child2();
        System.out.println("hehe");

    }

}
