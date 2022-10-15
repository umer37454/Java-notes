package InnerClass;

class Outer{
    int a;
    void show(){
        System.out.println("Outer class display");
    }

    //inner class
    class Inner{
        public void diplay(){
            System.out.println("Inner class display");
        }
    }

    static class Inner2{
        public void display2(){
            System.out.println("Static inner class display");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        //simple obj to access func of class
        Outer obj1 = new Outer();
        obj1.show();

        //now creating obj of inner class to access inner class
        Outer.Inner obj2 = obj1.new Inner(); //obj needed of outer to make inner class obj
        obj2.diplay();

        Outer.Inner2 bin = new Outer.Inner2();
        bin.display2();
    }
}
