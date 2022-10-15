package Interfaces.ExtendedDemo2;

public class example {

    int a;

    void A(){
        this.a = 4;
    }

    void B(){
        this.a = 10;
    }

    public static void main(String[] args) {

        example h = new example();

        //after calling this func a become 4
        h.A();
        System.out.println(h.a);

        //after calling this func a become 10
        h.B();
        System.out.println(h.a);
    }
}
