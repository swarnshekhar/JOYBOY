package OOPs.interfaces;

public interface engine {
   abstract void start();//same as void start();
    void stop();//these are abstract classess.
    void acc();//abstract classes.

    default void drink(){
        System.out.println("hi");
     }
     //default ki wajah se interface ko class mei badle bina method ko access kr skte hai..

     void drinkk();
}
 