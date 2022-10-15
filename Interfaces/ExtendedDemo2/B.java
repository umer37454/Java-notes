package Interfaces.ExtendedDemo2;

public interface B  {

    //static should have a body
    static void greeting(){
        System.out.println("Hello static");
    }

    void greet();

//    default void fun(){
//        System.out.println("I m in A");
//    }
}

