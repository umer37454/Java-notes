package generics.Comparison;

public class Student /*implements Comparable<Student>*/ {
    int rollno;
    float marks;

    Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "" + marks;
    }

    /*  can compare here also by implementing this method
    @Override
    public int compareTo(Student o){
        int diff = (int) (this.marks - o.marks);
        return diff;
    }*/
}
