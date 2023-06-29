import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
         int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc= new Scanner(System.in);
        int ind =sc.nextInt();
        try {
            System.out.println("welcome to world");
            try {
                System.out.println(marks[ind]);
                
            } catch (IndexOutOfBoundsException e) { 
                System.out.println("sorrry this index does not exist");
                System.out.println("exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("exception in level 1");
        }
    }
}
