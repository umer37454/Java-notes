package Interfaces.ExtendedDemo2;

public interface A {

    //not necesseary to implement it
    default void fun(){
        System.out.println("I m in A");
    }
}
