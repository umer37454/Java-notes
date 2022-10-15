package Interfaces.NestedInterfaces;

public class A {
    public interface nestedinterface{
        boolean isodd(int num);
    }
}

//by . u access inner classes or interface
class B implements A.nestedinterface{
    @Override
    public boolean isodd(int num) {
        return ((num & 1) == 1) ;
    }
}
