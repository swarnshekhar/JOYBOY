package OOPs.inheritance;

public class boxprice extends boxweight {
    int price=200;

    public boxprice(double l, double h, double w, double weight, int price) {
        super(l, h, w, weight);
        this.price = price;
    }

    public boxprice(boxprice other) {
        super(other);
        this.price=other.price;
    }
    public boxprice(boxweight other) {
        super(other);
        
    }

    

    
}
