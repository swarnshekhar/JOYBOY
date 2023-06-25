
public class getters_setters {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access
        // modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
        // private access modifiers ko .operator se access nhi kr skte isliye...getters
        // and setters ka prayaog krte hai...now one question arises that why to use
        // private it makes our work inconvenent actually its opposite...as we can
        // control for eg number should not start with numeric value etc

    }
}

class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;

    }

    public int getId() {
        return id;
    }

}
