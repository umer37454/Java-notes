package notes;

public class OOpsbasic {

    // doesn't exist physically... made it inner class
    static class Student {
        int rollno;
        String name;
        float marks;

        // this keyword ref var that points to current object. also for same name in class and constructor
        Student(int rno, String naam, float mark) {
            this.rollno = rno;
            this.name = naam;
            this.marks = mark;
        }

        //value takes from another object
        Student(Student other) {
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;
        }

        //calling constructor from another constructor
        Student() {
            //internally it will call Student()
            this(12, "Ansa", 55.9f);
        }
    }
    public static void main(String[] args) {

        //initialising
        /*umer.marks = 55.5f ;
        umer.rollno = 5;
        umer.name = "Ansari";

        //printing
        System.out.println(umer.marks);
        System.out.println(umer.name);
        System.out.println(umer.rollno);
        to avoid these repeating of obj name constructor is used*/


        // creating object in heap
        Student umer = new Student(5, "Ansari", 55.2f);
        System.out.println(umer.name + " " + umer.rollno + " " + umer.marks);

        //constructor example
        Student student2 = new Student(7, "umer", 54.8f);
        System.out.println(student2.name + " " + student2.rollno + " " + student2.marks);

        //passing umer val in random using constructor
        Student random = new Student(umer);
        System.out.println(random.name + " " + random.rollno + " " + random.marks);

        //calling constructor from other constructor
        Student random2 = new Student();
        System.out.println(random2.name + " " + random2.rollno + " " + random2.marks);
    }


}
