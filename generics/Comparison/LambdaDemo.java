package generics.Comparison;

interface A{
    void show();
}

class xyz implements A{

    @Override
    public void show() {
        System.out.println("Hello world 1");
    }
}

public class LambdaDemo {
    public static void main(String[] args) {

        //simple method to access show meth
        A o1 = new xyz();
        o1.show();

        //second method with anonymous class to access show meth by creating
        //obj ref of interface
        A o2 = new A() {
            @Override
            public void show() {
                System.out.println("Hello world 2");
            }
        };
        o2.show();

        //lambda meth to access show meth without creating anony class
        A o3 = () -> System.out.println("Hello world 3");

        o3.show();

    }
}
