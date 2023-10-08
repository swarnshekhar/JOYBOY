import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for multiplication");
        int num=sc.nextInt();
        for (int i = 1; i <=70; i++) {
            System.out.printf("%d X %d =%d\n",num,i,num*i);
        }
    }
}
