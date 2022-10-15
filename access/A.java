package access;

public class A {
    private int num;
    public String name;
    int[] arr;

    public void setNum(int num) {
        this.num = num;
    }

    //this method is public and is returning private member. meth can access cos it is in scope
    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
