package OOPs.generics;

import java.util.ArrayList;
import java.util.Arrays;


public class custom_arraylist {

    private int[] data;
    private static int default_size = 10;
    private int size = 0;

    
    public custom_arraylist() {
        this.data = new int[default_size];
    }

    public void add(int num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
            
        }
        data=temp;
    }

    private boolean isfull() {
        return size == data.length;
    }
public int remove(){
    int removed=data[--size];
    return removed;
}
public int get(int index){
    return data[index];
}
public int size(){
    // return data[size];
    return size;
}
public void set(int index,int value){
    data[index]=value;
}




    @Override
public String toString() {
    return "custom_arraylist {" + Arrays.toString(data) + ", size=" + size + "}";
}

    public static void main(String[] args) {
        custom_arraylist list=new custom_arraylist();
        // list.add(3);
        // list.add(5);
        // list.add(9);
        // list.add(20);
        for (int i = 0; i <14; i++) {
            list.add(2*i);
        }
       System.out.println(list);
    ArrayList<Integer> list2=new ArrayList<>();
    //THIS INTEGER IS CALLED GENERICS.
    // list.add("dggh"); shows error.
    }
}
