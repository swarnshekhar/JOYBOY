package OOPs.Access_control;

public class main {
    public static void main(String[] args) {
        a obj = new a(45, "swarn");
        // System.out.println(obj.name);//it is private
        System.out.println(obj.num);// it is public
        // System.out.println(obj.arr);//it is protected
        System.out.println(obj.getName());
        obj.setName("sudhanshu");
        System.out.println(obj.getName());
    }

}
//if we will not use public we will be only able to access it in same file.
//if u will use public u can use it in world.