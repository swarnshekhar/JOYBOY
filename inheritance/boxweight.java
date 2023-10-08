package OOPs.inheritance;

public class boxweight extends box{
    double weight;

    public boxweight() {
        this.weight = -1;
    }
    boxweight(boxweight other){
        super(other);
        
    }

    public boxweight(double l, double h, double w, double weight) {
        super(l, h, w);
        //used to initialise the values present in the parent class.
        // System.out.println(this.w);
        // System.out.println(super.l);
        this.weight = weight;
    }
    

    
}
