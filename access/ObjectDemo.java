package access;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    //just a unique value and number of obj
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //just check the content of obj...  modifying also
    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // used to print obj hashcode but can override with our own meth.
    @Override
    public String toString() {
        return super.toString();
    }

    //called during garbage collection
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
