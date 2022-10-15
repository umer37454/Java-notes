package polymorphism;

import access.A;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Sqaure sqaure = new Sqaure();

        //this one all call child method
        shape.area();
        circle.area();
        sqaure.area();

        // this one going to call parent one
        Shapes a = new Shapes();
        a.area();

        //meth to call here will depend upon child class obj type.
        //this also known as upcasting and is determine via dynamic method dispatch
        Shapes b = new Circle();
        b.area();

        Shapes.greetings();
        circle.greetings(); //u cant override it but can inherit . for override obj creation is needed

        //just importing class from other package
        A ob = new A(45, "Umer");
        System.out.println(ob.getNum());

        System.out.println(ob.name);
    }
}
