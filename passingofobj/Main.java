package passingofobj;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(10,20);
        Box b2 = new Box(10,20);

        //pasiing obj when invoking or calling a constructor
        Box b3  = new Box(b2); //contain property of b2 in b3

        //for returning obj. that will call temp in duplicate func.
        Box b4 = Box.duplicate();

        b3.display();
        b4.display();

        //this is calling func with b1 and passing obj as b2
        if (b1.isEqualto(b2)){ //return true or false
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }

        //here it is static funct
        if (Box.compareTo(b1,b2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
