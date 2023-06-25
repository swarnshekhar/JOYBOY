class c1{
    public int x=5;
    protected int y=45;
    int z=6;
    private int a=70;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}


// subclass mtlb...kisi dusre package mei...iss package ka class inherit krna
// world mtlb...aap na same class mei haiii,na same package mei hai...,na subclass mei hai...mtlb aap world mei hai


public class access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);//throws an error because within same package we cannot re use private modifier
    }
}
