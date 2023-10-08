package OOPs.interfaces;

public class main {
    public static void main(String[] args) {
        car Car = new car();
        engine Car1 = new car();

        // HIGHLY IMPORTANT

        // what things u can access depends on...engine Car1...what version of things to
        // access depends on car();(OBJECT) this.

        Car.acc();
        Car.start();
        Car.stop();
        Car.brake();

        Car1.acc();
        Car1.start();
        Car1.stop();
        Car1.drink();
        // Car1.brake;----->throws error...why...?

        // refer above lines///
        nicecar car = new nicecar();
        car.start();
        car.playMusic();
        car.upgradeengine();
        car.start();
    }
}
// previoulsy two classes must be related to each other to access same
// functions.now unrelated class can also implement same interface.


//class to interface use implements.
//interface to interface use extends.