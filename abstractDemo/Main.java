package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(26);
        daughter.career();
        daughter.partner();

        //ref of parent and obj of son
        Parent son2 = new Son(45);
        son2.career();

        //accessing static meth of abs
        Parent.hello();

        //normal meth of parent abs class
        son.normal();
    }
}
