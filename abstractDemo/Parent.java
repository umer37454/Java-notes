package abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    //can make it cos it is static
    static void hello(){
        System.out.println("Hello static meth of abs class");
    }

    void normal(){
        System.out.println("Normal meth");
    }

    //1 abst make entire class abst
    abstract void career();
    abstract void partner();
}
