package staticexample;

public class Staticblock {
    static int a;
    static int b;

    //can make any set of instruction as static. will be executed first
    //only run once when the first obj is created i.e when the class is loaded
    static {
        System.out.println("Block 1");
        a = 20;
        System.out.println(a);
    }

    //can be more than one
    static {
        System.out.println("Block 2");
        b=30;
        System.out.println(b);
    }

    public static void main(String[] args) {
        Staticblock obj = new Staticblock();
        System.out.println(Staticblock.a);

        Staticblock ob1 = new Staticblock();

        Staticblock.a = 54;
        System.out.println(Staticblock.a);

    }
}
