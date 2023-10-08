package OOPs;

public class lecture_2_human__extd {
    public static void main(String[] args) {

        human swarn = new human(18, "swarn shekhar", 1000000, false);
        human rahul = new human(14, "rahul", 10000, true);
        human arpit = new human(14, "arpit", 10000, true);

        System.out.println(swarn.name);
        System.out.println(human.population);
        System.out.println(human.population);
    }
 
    // u can't have non static inside static but static inside non static is
    // allowed.
    void greetings() {
        // deopendent on objects
        System.out.println("hello world");
        fun();

    }

    static void fun() {
        // this is not dependent on objects
        // greetings();//u can't use it use it because it require an instance but the
        // function u are using it in do not require instances.

        // u cannot access an non static stuff without referencing their instances in a
        // static context.
        main obj = new main();
        obj.greetings();
    }

    void fun2() {
        greetings();
    }
}
