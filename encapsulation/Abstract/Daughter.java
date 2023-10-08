package OOPs.Abstract;

public class Daughter extends parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i want to become doctor");
    }

    @Override
    void partner() {
        System.out.println("my partner is swarn he is of age 18");
    }
    
}
