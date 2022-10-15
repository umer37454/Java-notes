package constructorininherit;

class base{
    int x;
    int maxspeed = 120;

    base() {
        System.out.println("In a deafult base constructor");
    }

    base(int x) {
        this.x = x;
        System.out.println(x);
    }

    public void nothing(){
        System.out.println("Nothing");
    }
}

class derived extends base{
    int y;
    int maxspeed = 100;


    public derived() {
        System.out.println("In a default derived constructor");
    }

    public derived(int y) {
        this.y = y;
        System.out.println(y);
    }

    public derived(int x, int y) {
        //this will call constructor of base that takes x. cos u can change what constructor to be called
        super(x);
        this.y = y;
        System.out.println(x + " " + y );
    }

    public void display(){
        //this will call super class member. super also used to access parent meth and members
        System.out.println(super.maxspeed);
        System.out.println(maxspeed);
    }

    //this is run time poly also
    public void nothing(){
        // calling parent func.
        super.nothing();
        System.out.println("Nothing of derived");
    }
}

class ofderived extends derived{
    int z;

    public ofderived() {
        System.out.println("In a default grandchild constructor");
    }

    public ofderived(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println(x + " " + y + " " + z);
    }

}

public class ConstructorInheritance {
    public static void main(String[] args) {
        //this will call first base constru then derived const
        derived a = new derived();

        //this will also call base constructor then derived constru of taking argument
        derived b = new derived(4);

        //this will call the constru of base first which takes x then derived const which takes y
        derived c = new derived(4,8);
        c.display();
        c.nothing();

        ofderived d = new ofderived(); //this will call base construct of all classes

        /*
        this will call base constru which takes x then derive construc which takes x & y
         then ofderived constructo which takes x,y & z
        */
        ofderived e = new ofderived(8,5,7);
    }
}
