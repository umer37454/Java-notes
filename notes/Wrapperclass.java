package notes;

class A {
    final int num = 14;
    String name;

    public A(String name) {
        this.name = name;
    }

    // when obj is about to be destroyed java provides a way to perform certian action manually using finalize
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is being destroyed");
//    }
}

public class Wrapperclass {
    public static void main(String[] args) {
        //wrapper class using primitives as object
        Integer a = 10;

        //can't change it
        final int b = 10;

        final A umer = new A("Ansari");
//        umer = new A("Umer"); not allowed cant change in final

        A obj2;

        for (int i = 1; i < 10000000; i++) {
            obj2 = new A("umer ansari");
        }
    }

}

