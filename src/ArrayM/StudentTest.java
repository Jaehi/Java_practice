package ArrayM;

public class StudentTest {
    public static void main(String[] args) {
        Student Seungmin = new Student(922,"Seungmin");
        Student Hyunjin = new Student(320,"Hyunjin");

        Seungmin.addSubject("Math",100);
        Seungmin.addSubject("Korean",100);
        Seungmin.addSubject("Science",90);

        Hyunjin.addSubject("Art",90);
        Hyunjin.addSubject("Korean",78);

        Seungmin.showInfo();
        Hyunjin.showInfo();
    }
}
