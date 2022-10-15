package notes;

public class shadowing {
    static int a = 10;  // this will be shadowed at line 8
    // a = 44 ;  cant be re initialised
    public static void main(String[] args) {

        System.out.println(a); // 10
        int a = 45;     // now shadowed

        // scope will begin when it is initialised not just declare
        System.out.println(a); // 45

        fun();
    }

    static void fun(){
        System.out.println(a);  // 10
    }
}
