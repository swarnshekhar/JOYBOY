package OOPs.object;

public class objectdemo {
    int num;
    float value;

    public objectdemo(int num,float value) {
        this.num = num;
        this.value=value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((objectdemo)obj).num;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {
        objectdemo obj1=new objectdemo(12,46);
        objectdemo obj2=new objectdemo(12,56);
        // System.out.println(obj1.hashCode());
        // System.out.println(obj2.hashCode());
        if(obj1==obj2){
            System.out.println("obj1 is equaaaaaal than obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }
        System.out.println(obj1 instanceof objectdemo);
        System.out.println(obj1 instanceof Object);
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());
    }
}

