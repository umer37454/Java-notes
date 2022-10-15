package staticexample;


//outside classes cannot be static
public class InnerClass {

    //innner class static - depends upon outer
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }

        //internal process chngg
        public String toString(){
            return name;
        }

    }

    public static void main(String[] args) {

        Test obj = new Test("Umer");
        Test obj1 = new Test("Ansari");

        System.out.println(obj);
        System.out.println(obj1);
    }


}