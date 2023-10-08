package learning_java;
public class methods {


static int result(int x, int y){

int z;
if(x>y){
    z=x+y;
}
    else{
        z=(x+y)*5;
    }
    return z;

}

    public static void main(String[] args) {
        int a=23;
        int b=43;
        int c;
        c=result(a, b);
        System.out.println(c);
        int a1=34;
        int b1=23;
        int c1;
        c1=result(a1, b1);
        System.out.println(c1);

    }
    
}
