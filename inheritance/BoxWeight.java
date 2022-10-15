package inheritance;

public class BoxWeight extends Box {
    double weight;

    //default constructor
    public BoxWeight() {
        super();
        this.weight = -1;
    }

    //constructor taking obj
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight) {
        //call the parent constructor, also differentiate name, it should be above this
        //if u don't use this then default constructor will be called
        super(l, h, w, weight);
        //used to initialise values present in parent class
        this.weight = weight;
    }

}
