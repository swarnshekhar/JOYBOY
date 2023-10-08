package OOPs;

public class human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("hello world");
        // System.out.println(this.age);//u can't access age bcz static things dont use objects.
    }

    public human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population+=1;
        human.message();
    }

}
