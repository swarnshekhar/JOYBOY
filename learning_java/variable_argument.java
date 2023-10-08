package learning_java;

public class variable_argument {

static int sum(int ...arr){
    int result=0;
    for(int a:arr){
       result +=a;   

    }
    return result;
}



    public static void main(String[] args) {
        
        System.out.println("summation of 2 and 3 is "+ sum(2,3));
        System.out.println("summation of 2 and 3 and 4 is "+ sum(2,3,4));
        System.out.println("summation of 2 and 3 and 6 and 7 is "+ sum(2,3,6,7));
        System.out.println("summation of 4 and 5 ,7,78 and 99 is "+ sum(4,5,7,78,99));
        System.out.println("summation of nothing is "+ sum());
    }
    // agar aap chahte ho nothing jaisa kuch na ho ek number hona hi chaiye toh...
    // static int sum(int x,int ...arr){
    // int result=x;

}
