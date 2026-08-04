package CoreJava.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class UsingComparable
{
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Shubham"));
        students.add(new Student(50, "Abhishek"));
        students.add(new Student(30, "Vikas"));
        students.add(new Student(40, "Pallavi"));


        //This working because Comparable interface is implemented in concrete class
        Collections.sort(students);

        for(Student student : students)
            System.out.println(student);
    }
}
