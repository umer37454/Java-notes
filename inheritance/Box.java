package inheritance;

import java.security.spec.EdECPoint;

public class Box {
    double l;
    double h;
    double w;
    //double weight;

    //default constructor if make then u have to make it for all
    Box() {
    /*
    points to object class which is internal
    super();
    */
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side) {
        this.w = side;
        this.h = side;
        this.l = side;
    }

    //pass obj in it
    Box(Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    Box(double l, double h, double w, double weight) {
        this.l = l;
        this.h = h;
        this.w = w;
        //this.weight = weight;
    }

    public static void information() {
        System.out.println("Running the box");
    }
}
