package OOPs.polymorphism;

public class numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        numbers obj=new numbers();
        obj.sum(2, 3, 5);
        obj.sum(2, 5);
    }
}
