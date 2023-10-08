package OOPs.interfaces;

public class car implements engine,brake{
int a=10;
    @Override
    public void acc() {
          System.out.println("i accelerate like a normal car");        

    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
          System.out.println("i start like a normal car");        

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
          System.out.println("i stop like a normal car");        

    }

    @Override
    public void brake() {
  System.out.println("i breake like a normal car");        
    }

    @Override
    public void drinkk() {
      // TODO Auto-generated method stub
      
    }
    
}
