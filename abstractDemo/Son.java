package abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I m going to be Engineer");
    }

    @Override
    void partner() {
        System.out.println("Partner name is Iron man");
    }
}
