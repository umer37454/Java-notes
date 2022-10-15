package dynamicmethod_PolyEgAlso;

class Phone {
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}

class Smartphone extends Phone {
    public void greet2(){
        System.out.println("Good Night");
    }
    @Override
    //ovverride the meth from super
    public void on(){
        System.out.println("Turning on smartphone...");
    }
}

public class Main {
    public static void main(String[] args) {
        //this allowed
        Phone obj = new Phone();
        Smartphone Spobj = new Smartphone();
        obj.greet();
        Spobj.on(); // accesing super meth from sub
        Spobj.greet2();

        //but this can happen cos u can call nokia phone a phone but not smartphone
        //and can call samsung smartphone and phone both
        Phone obj2 = new Smartphone();
        //Smartphone Sobj2 = new Phone(); not allowed

        //this will call smartphone func cos obj is smartphone not ref of obj i.e. phone
        obj2.on();
        obj2.greet(); // can access this also. cos sub obj accesing super meth
        //obj2.greet2(); not allowed
    }
}
