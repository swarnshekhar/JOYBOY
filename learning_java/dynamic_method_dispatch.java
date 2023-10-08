package learning_java;
class phone {

    public void greet() {
        System.out.println("good morning");
    }

    public void name() {
        System.out.println("my name is swarn shekhar");

    }

}

class smartphone extends phone {
    public void swaagat(){
        System.out.println("aapka swagat haiii");
    }


    public void name() {
        System.out.println("my name is swarn shekhar in class two");
    }

}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
//  phone obj = new phone();
//   obj.name();
phone obj= new smartphone(); //allowed
// smartphone obj2=new phone(); //not allowed

obj.greet();
obj.name();


    }

}
