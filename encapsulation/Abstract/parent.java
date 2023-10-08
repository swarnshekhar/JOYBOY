package OOPs.Abstract;


public abstract  class parent {
int age;


    public parent(int age) {
    this.age = age;
}
    abstract void career();
    abstract  void partner();
    // abstract   partner();// u cannot create abstract constructor. 

//    abstract  static void greetings(); // u cannot create abstract static.

static void greetings(){
    System.out.println("hello! good evenning.");
}
//but u can use static method in abstract class.
}
