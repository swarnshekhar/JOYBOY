package learning_java;
class MymainEmployee{
    private int id;
    private String name;

    public MymainEmployee(){
        id=45;
        name="your_name_here";
    }

     public MymainEmployee(String myname,int myid){
        id=45;
        name=myname;
        id=myid;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
        MymainEmployee swarn =new MymainEmployee("codingwithswarn",32);
        //remember agar mymainemployee main kuch nhi dalooge toh...wo pehla wala public run hoga...jisme bhi kuch nhi hai...
        // swarn.setName("swarna shekharam");
        // swarn.setId(34);
        System.out.println(swarn.getId());
        System.out.println(swarn.getName());

    }
    
}
