package inheritance;

public class Main {
    public static void main(String[] args) {
//        Box b1 = new Box();
//        Box b2 = new Box(b1);
//        Box b4 = new Box(4.0); //takes 1 argu
//        //print obj member
//        System.out.println(b1.h + " " + b1.l + " " + b1.w);
//        System.out.println(b2.h + " " + b2.l + " " + b2.w);
//        System.out.println(b4.l);
//        Box.information();
//
//        BoxWeight b3 = new BoxWeight(2,3,4,5);
//        System.out.println(b3.l);
//        System.out.println(b3.h);
//        System.out.println(b3.w);
//        System.out.println(b3.weight);
//
        /*Obj ref is parent but obj is child. parent is refer to child some time*/
        Box b5 = new BoxWeight(5,6,9,7);
        //only parent member is accesed not weight
        //System.out.println(b5.weight);
        System.out.println(b5.h);
//
//        //obj of old
//        Box bOld = new Box(b5);
//        System.out.println(bOld.w);
//
//        /*This will give error cos Box doesn't know about any child class or its members
//        BoxWeight b6 = new Box();  but child class knows everything about parent */
//
//        BoxWeight b6 = new BoxWeight(4,5,8,6);
//        System.out.println(b6.weight);
//
//        BoxWeight b7 = new BoxWeight(b6);
//        System.out.println(b7.h);

        BoxPrice box = new BoxPrice(45,58,87);
        System.out.println("Box length, breadth, and height " + box.l + " " + box.h + " " + box.w);

    }

}
