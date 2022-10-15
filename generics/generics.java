package generics;

class mydata<T , E>{
    T a;
    E b;

    public void add(T i , E j){
        this.a = i;
        this.b = j;
    }

    public T getA() {
        return a;
    }
    public E getB() {
        return b;
    }
}

public class generics {
    public static void main(String[] args) {
        mydata<Integer, String> obj1 = new mydata<Integer, String>();
        obj1.add(8, "Umer");
        System.out.println(obj1.getA());
        System.out.println(obj1.getB());
    }
}
