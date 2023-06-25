public class multidimensional_array {
    public static void main(String[] args) {

// int marks[];
// int [][]flats;
// flats=new int[2][3];
// or
int [][]flats=new int[2][3];
flats[0][0]=101;
flats[0][1]=102;
flats[0][2]=103;
flats[1][0]=201;
flats[1][1]=202;
flats[1][2]=203;
  System.out.println("forming a 2d array");
  for(int i=0;i<flats.length;i++){
    for(int j=0;j<flats[i].length;j++){
        // mtlb i=0 row ke liye ye niche diye statement pore kro
    System.out.print(flats[i][j]);
    System.out.print(" ");
  }

System.out.println("");



  }
    }
    
}
