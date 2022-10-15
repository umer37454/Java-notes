package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I m going to be Doctor");
    }

    @Override
    void partner() {
        System.out.println("Partner name is superman");
    }
}
