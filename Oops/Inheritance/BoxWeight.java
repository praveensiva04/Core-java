package Inheritance;

public class BoxWeight extends Box {
    double weight;
    double b;
    public BoxWeight(){
        this.weight=8;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
    public BoxWeight(double l, double h, double w, double weight, double b) {
        super(l, h, w);// it will call the parent class constructor.
        this.weight = weight;
        this.b = b;
    }
    
}
