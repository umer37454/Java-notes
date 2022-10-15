package Interfaces.ExtendedDemo2;

public class Main implements A, B {
    @Override
    public void greet() {
        System.out.println("Hello 1");
    }

    public static void main(String[] args) {
        //static meth calling
        B.greeting();
    }
}
