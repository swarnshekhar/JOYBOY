package OOPs;

public interface baic {
    public static void main(String[] args) {

        class student {
            String name;
            int roll = 36;
            float marks;
            int phno;

            student() {
                this.name = "swarn shekhar";
                this.roll = 1;
                this.marks = 98;
            }

            void greetings() {
                System.out.println("hi,my name is " + this.name);
            }
            void changename(String newName){
                this.name=newName;
            }

            
                // this.phno = phno;
            
            
        }
        // whenever new object is created it goes inside constructor
        student swarn = new student();

        // swarn.name = "swarn shekhar";
        // swarn.roll = 11;
        // swarn.marks = 100;

        student aka = new student();

        // System.out.println(swarn);
        // System.out.println(swarn.roll);
        // System.out.println(swarn.name);
        // System.out.println(swarn.marks);
        // System.out.println();
        // System.out.println(aka.name);
        // System.out.println(aka.roll);
        swarn.changename("sudhanshu");
        swarn.greetings();
    }
}
