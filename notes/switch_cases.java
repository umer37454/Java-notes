package notes;

import java.util.Scanner;

public class switch_cases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter fruit: ");
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("Keep you away from doctor");
//                break;
//            case "Orange":
//                System.out.println("Good for high protein");
//                break;
//            default:
//                System.out.println("Please enter valid fruit");
//                break;
//        }

//        System.out.print("Enter day number: ");
//        int day = input.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekend");
//                break;
//        }
//
        // 2nd style
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
//            case 6, 7 -> System.out.println("weekend");
//        }

        System.out.print("enter id: ");
        int empid = input.nextInt();

        System.out.print("enter department: ");
        String depart = input.next();

        switch (empid){
            case 1 :
                System.out.println("Ansari Umer");
                switch (depart){
                    case "It":
                        System.out.println("it department");
                }
                break;

            case 2 :
                System.out.println("Rahul Rana");
                switch (depart){
                    case "civil":
                        System.out.println("civil department");
                }
                break;

            case 3 :
                System.out.println("Deepak yadav");
                switch (depart){
                    case "comps":
                        System.out.println("comps department");
                }
                break;
        }
    }
}
