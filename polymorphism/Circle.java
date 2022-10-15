package polymorphism;

public class Circle extends Shapes {

    //in override func name param return type should be same in child class. mirroring

    void area(){
        System.out.println("Area is pie * r * r");
    }

    static void greetings(){
        System.out.println("In static meth of circle");
    }
}
