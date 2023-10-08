package OOPs.polymorphism;

public class circle extends shapes {
   @Override//this is called annotation.
   void area(){
        System.out.println("area is pie*r*r");
    }
//     @Override//will give error..bcz area2 doesn't exist in parent class...
//    void area2(){
//         System.out.println("area is pie*r*r");
//     }
}
//circle has area..and shape also has area..this is what we call overriding.
//child class is overriding parent/main one.