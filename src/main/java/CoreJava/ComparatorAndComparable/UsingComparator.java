package CoreJava.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparator
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Shubham"));
        students.add(new Student(50, "Abhishek"));
        students.add(new Student(30, "Vikas"));
        students.add(new Student(40, "Pallavi"));


        //This will not work because Comparable interface is not implemented in this concrete class
        //Collections.sort(students);

        Comparator<Student> studentComparator = new Comparator<Student>(){
            public int compare(Student o1, Student o2) {
                //return o1.age - o2.age; //Asc
                return o2.age - o1.age;  //Desc
            }
        };

        //Collections.sort(students, studentComparator);

        //Using lambda expression
        Collections.sort(students, (o1, o2) -> o1.age - o2.age);

        for(Student student: students)
            System.out.println(student);
        int a;
    }
}
