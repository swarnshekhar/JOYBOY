package OOPs.inheritance;

public class main {
    public static void main(String[] args) {
        box Box1=new box(4,5,6);
        box Box2=new box(Box1);
        boxweight Box3=new boxweight();
        boxweight Box4=new boxweight(3,4,5,6);

        // System.out.println(Box1.l+" "+Box1.h+" "+Box1.w);
        // System.out.println(Box2.l);
        // System.out.println(Box3.weight);
        // System.out.println(Box3.l);
        // System.out.println(Box1.l+" "+Box2.h+" "+Box3.w+" "+Box4.weight);
        // System.out.println(Box4.l+" "+Box4.h+" "+Box4.w+" "+Box4.weight);

        box Box5=new boxweight(2, 3, 10, 45);
        // System.out.println(Box5.w);
        // System.out.println("yo");
        // boxweight Box6=new Box1(2,3,4);//not allowed
        // System.out.println(Box6);
        boxprice box7=new boxprice(1, 2, 3, 4, 100);
        boxprice box8=new boxprice(Box3);//tum yeha boxprice ka cheeze daal skte ho ya boxweight ka..mtlb box3,box4 or box7 bcz boxprice ke function mei aisa hi use kiya gaya hai....
        
        boxprice box9=new boxprice(box7);
        // boxprice box10=new boxweight(0, 0, 0, 0);not allowed
        boxweight box11=new boxprice(box9);
        // System.out.println(box7.l);
        // System.out.println(box7.price);

        System.out.println(box8.price);
        
    }
}
