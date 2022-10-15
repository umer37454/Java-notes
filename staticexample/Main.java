package staticexample;

//this class is outside
class Human {
    int age;
    String name;
    static long population;

    static void isgreeting() {
        System.out.println("Hello world");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Human.population += 1;

    }

}

public class Main {

    public static void main(String[] args) {
        Human a = new Human(17, "Ansari");
        Human b = new Human(17, "Umer");
        Human c = new Human(17, "Rahul");

        System.out.println(a.name + " " + a.age);
        System.out.println(b.name + " " + b.age);
        System.out.println(c.name + " " + c.age);
        System.out.println(Human.population); //static doesnt depend upon object attached to class

        //caliing static
        Human.isgreeting();

        //cant access non static from static
        //fun()

        //to access nonstatic stuff make an obj ref
        Main ab = new Main();
        ab.fun();   // is accesible now cos of obj made
        greet();   // accesible cos it is static
    }

    static void greet() {
        Main dc = new Main();
        dc.fun();
        System.out.println("Hello greet");
    }

    //have to make it static to use it cos static means that it doesnt belong to obj to access
    void fun() {
        /* can access static from nonstatic */
        //greet();  // just an example
        System.out.println("Hello fun");
    }

}
