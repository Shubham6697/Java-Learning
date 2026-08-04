package CoreJava.ComparatorAndComparable;

public class Student implements Comparable<Student>
{
    String name;
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Student o2)
    {
//        return this.age - o2.age; //Asc
        return o2.age - this.age; //Desc
    }
}
