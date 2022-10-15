package enumexamp;

//enum doest support inheritance but support interface
enum month implements A{

        //these will remain constatnt. can't change it. like public static final
        January(30),
        February(28),
        March(31),
        April(30),
        May(31),
        June(30),
        July(31),
        August(31),
        September(30),
        October(31),
        November(30),
        December(31);

        final int days;

        month(int days) {
            //constructor is called for every month in enum from 1 var
            //System.out.println(this);
            this.days = days;
        }

        @Override
        public void hello() {
            System.out.println("Hello in enum");
        }

}

public class Basic {

    public static void main(String[] args) {
        month first;
        //this will call construtor like
        // month first = new month();
        first = month.April;

        //will print first initialisation of first
        //System.out.println(first);

        for (month i: month.values()) {
            System.out.println(i +" " + i.days);
        }

    }
}
