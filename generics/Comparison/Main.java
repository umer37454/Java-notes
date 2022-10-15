package generics.Comparison;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student umer = new Student(8, 85.45F);
        Student ansari = new Student(2, 95.45F);
        Student raj = new Student(6, 75.45F);
        Student shekhar = new Student(9, 92.45F);

        Student[] list = {umer, ansari, raj, shekhar};
        System.out.println(Arrays.toString(list));

        //by using anonymoys class & can use lambda expressiom
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
            return (int) (o1.marks - o2.marks);
        }});
        System.out.println(Arrays.toString(list));

        /* if (umer.compareTo(ansari) < 0) {
            System.out.println("Umer has more marks");
        }*/
    }
}