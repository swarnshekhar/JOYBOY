class employee {
    int id;
    String name;
    int salary;

    public void details() {
        System.out.println("my id is " + id);
        System.out.println("my name  is " + name);
        System.out.println("my salary is " + salary);
    }
    public int getSalary() {
        return salary;
    }

    }

    public class custom_Class {
        public static void main(String[] args) {
            employee swarn = new employee();

            swarn.id = 12;
            swarn.name = "Diving energy";
            swarn.salary = 14;
            // System.out.println(swarn.id);
            // System.out.println(swarn.name);
            // System.out.println(swarn.salary);
           swarn.details();

            employee sudhanshu = new employee();
            sudhanshu.id = 142;
            sudhanshu.name = "Diving violet";
            sudhanshu.salary = 18;

            sudhanshu.details();

            employee computer = new employee();
            computer.id = 1242;
            computer.name = "potential extracted";
            computer.salary = 12;

            computer.details();

            swarn.getSalary();
        }

    }


