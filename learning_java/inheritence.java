package learning_java;
class base {
    public int x;

    public void setX(int x) {
        System.out.println("i am a base and setting x now");
        this.x = x;
    }

    public int getX() {
        return x;
    }
    

}class derived extends base{
    public int y;

    public void setY(int y) {
        System.out.println("i am a derived class and setting y now");
        this.y = y;
    }

    public int getY() {
        return y;
    }

}


public class inheritence {
    public static void main(String[] args) {
base swarn=new base();
derived sudhanshu= new derived();

swarn.setX(45);
sudhanshu.setY(65);


System.out.println(sudhanshu.getY());



    }

}
