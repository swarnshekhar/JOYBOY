package learning_java;
class circle {

    public int radius;
    circle(){
        System.out.println("i am not paramatrised constructor of circle");
    }

    circle(int r) {
        System.out.println("i am circle paramatrised constructor");
        this.radius = r;
    }

    public double areacircle() {

        return Math.PI * this.radius * this.radius;
    }

}

class cylinder1 extends circle {
    public int height;

    cylinder1(int r, int h) {
        super(r);
        // agar yeha super mein r nhi hota toh...non paramartrised waala lega
        
                System.out.println("i am a cylinder paramatrised constructor");

        this.height = h;

    }

    public double volumecylinder() {

        return Math.PI * this.radius * this.radius * this.height;

    }

}

public class inheritence_practice {
    public static void main(String[] args) {

        // cylinder1 cy = new cylinder1();
        // circle objc = new circle(12);
        cylinder1 objcy=new cylinder1(12, 23);

    }
}
