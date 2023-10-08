package OOPs.Abstract;

import learning_java.default_method;

public class main {
    public static void main(String[] args) {
        Son son = new Son(56);
        son.career();

        Daughter daughter = new Daughter(36);
        // daughter.career
        System.out.println(daughter);
        daughter.career();

        //parent mom=new parent(45);// u cannot create object of abstract class.

    }
}
