package Object;

import java.util.Objects;

class Student {
    int studentId;
    String studentName;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student){
            Student student = (Student) o;
            if (studentId == student.studentId){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        String name = new String("망");
        String eman = new String("망");

        System.out.println(name == eman);
        System.out.println(name.equals(eman));

        Student student1 = new Student(100,"기망");
        Student student2 = new Student(100,"선무");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(System.identityHashCode(student1));

        System.out.println(name.hashCode());
        System.out.println(eman.hashCode());
    }
}
