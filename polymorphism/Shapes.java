package polymorphism;

public /*final. if final class meth aslo final*/class Shapes {

    int a=7;

    /* can maken it final to avoid oveeriding. early binding */ void area() {
        System.out.println("Im in shapes");
    }

    static void greetings(){
        System.out.println("In static meth of shapes");
    }
}
