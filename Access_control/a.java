package OOPs.Access_control;

import java_dsa_2.string;

public class a {
    public int num;
    private String name;
    protected int[] arr;
    // u can access private by getter and setter.

    public a(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
