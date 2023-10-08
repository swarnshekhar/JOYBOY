package OOPs.Abstract;

public class Son extends parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i want to become a programmer");
    }

    @Override
    void partner() {
        System.out.println("my partner is sudanshu he is of age 15");
    }
    
}
