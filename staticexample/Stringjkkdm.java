package staticexample;

public class Stringjkkdm {

    String a;
    int b;

    // obj or instance
    static Stringjkkdm name = new Stringjkkdm("Umer", 45);


    Stringjkkdm(String a, int b) {
        this.a = a;
        this.b = b;
    }


    static Stringjkkdm namee() {
        //returing an instance
        return name;
    }

    public static void main(String[] args) {

        System.out.println(namee());

    }
}
