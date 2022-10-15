package generics.Comparison;

interface AA{
    int iop(int a, int b);
}

class BB implements AA{

    @Override
    public int iop(int a, int b) {
        return a + b;
    }

}

public class smflasmdl {

    //this sum take variable of interface so that it can have a access its meth that we implemented
    //using anony class
    int sum(int a, int b, AA g){
        return g.iop(a, b);
    }

    public static void main(String[] args) {

        AA dhf = new BB();
        dhf.iop(5,2);

        //we directly implement the interface meth in this way we can avoid making class that
        //implements interface.. refer class BB for indirect way, so we would had to make 3 class
        // for 3 different implementation of iop method
        AA g1 = new AA() {
            @Override
            public int iop(int a, int b) {
                return a + b;
            }
        };


        //can write all this via lamba also
        AA g2 = new AA() {
            @Override
            public int iop(int a, int b) {
                return a * b;
            }
        };

        //can write this by lambda also
        AA g3 = new AA() {
            @Override
            public int iop(int a, int b) {
                return a - b;
            }
        };

        smflasmdl ghj = new smflasmdl();
        System.out.println(ghj.sum(4,2,g1));
        System.out.println(ghj.sum(4,2,g2));
        System.out.println(ghj.sum(4,2,g3));

    }

}

