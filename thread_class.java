
class nythread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<4000){

            System.out.println("my thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
class nythread2 extends Thread{
    @Override
    public void run(){
        while (true){

            System.out.println("thread 2 is good");
            System.out.println("i am sad");
        }
    }
}

}

public class thread_class {
    public static void main(String[] args) {
        nythread1 t1 = new nythread1();
        nythread2 t2 = new nythread2();
        t1.start();
        t2.start();
       
    }
}
