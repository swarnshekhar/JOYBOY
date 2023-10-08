package learning_java;
class details {
    String name;
    int salary;

    public int abtsalary() {
        System.out.println("member one salary is " + salary);
        return salary;

    }
    public String abtname() {
        System.out.println("member one name is " + name);
        return name;
    }
} class cellPhone{
    String vibrating;
    String  ringing;
    int ringa=13;
    
    public  int ringaa(){
        System.out.println("your phone is-->ringing "+ ringa);
        return ringa;
    }  public  String ring(){
        System.out.println("your phone is-->ringing "+ ringing);
        return ringing;
    }
     public void vibrate(){
        System.out.println("your phone is--> vibrating");
        

    }
} class square{
   int perimeter;
  int area;
    int  sidelength;

public void perimsq(){
    System.out.println("perimeter of square is "+ 4*sidelength);

}public void areaSq(){
    System.out.println("area of square is "+(sidelength)*(sidelength));
}
}class tommy{
   public void hit(){
    System.out.println("hit the enemy");
   }
   public void run(){
    System.out.println("run away from the enemy");
   }
   public void fire(){
    System.out.println("firing on an enemy");
   }
}
    public class question_oops {
        public static void main(String[] args) {
          
            // details swarn = new details();
          
            // int salary=90;
            // String name="swarn shekhar";

            // swarn.salary = 90;
            // swarn.name = "swarn shekhar";

            // swarn.abtsalary();
            // swarn.abtname();

            // QUESTION 2
            
        //      cellPhone phone=new cellPhone();
        //      phone.ringa=12;
        //    phone.ringing="ringgggggggg";
        //     phone.ringaa();
        //     phone.vibrate();
        //     phone.ring();

        // question 3
//   square pllgm=new square();
//         pllgm.sidelength=12;


//         pllgm.areaSq();
//         pllgm.perimsq();
// question 4
tommy game=new tommy();

game.run();
game.hit();
game.fire();

        }

    }



