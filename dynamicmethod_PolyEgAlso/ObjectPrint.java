package dynamicmethod_PolyEgAlso;

public class ObjectPrint {

    int num;

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public ObjectPrint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);

        //this is calling println that is taking obj and call valueof func then to string fun.
        //if child class that is ours doesn't have tostring it will call parent tostring
        System.out.println(obj);

    }
}
