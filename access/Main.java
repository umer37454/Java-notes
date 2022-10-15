package access;

public class Main {
    public static void main(String[] args) {

        A obj = new A(15,"Ansari");
        System.out.println(obj.getNum());


        ObjectDemo obj1 = new ObjectDemo(5);
        ObjectDemo obj2 = new ObjectDemo(5);

        System.out.println(obj1.equals(obj2));

    }
}
