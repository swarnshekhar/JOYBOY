package learning_java;
class calculation {
    private int radius;
    private int height;

    public calculation(int radius, int height) {
        // System.out.println("surface area of the cylinder is
        // "+2*Math.PI*radius*height+2*Math.PI*radius*radius);
        this.radius = radius;
        this.height = height;
    }

    public calculation() {
        // System.out.println("surface area of the cylinder is
        // "+2*Math.PI*radius*height+2*Math.PI*radius*radius);
        // this.radius=radius;
        this.height = height;
    }

    public int getradius() {
        return radius;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class calculation2 {
    private int length;
    private int breadth;

    public calculation2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getlength() {
        return length;
    }

    public int getbreadth() {
        return breadth;
    }

    public double area() {
        return length * breadth;
    }

}

public class practice_const_modifier {
    public static void main(String[] args) {

        calculation cylinder = new calculation(12, 14);
        // calculation cylinder=new calculation();

        // cylinder.radius=12;
        // cylinder.height=14;

        // cylinder.setradius(70);
        System.out.println(cylinder.getradius());

        calculation2 reactangle = new calculation2(16, 18);

        System.out.println(reactangle.getlength());
        System.out.println(reactangle.getbreadth());
        System.out.println(reactangle.area());
    }

}
