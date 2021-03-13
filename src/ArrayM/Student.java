package ArrayM;

import java.util.ArrayList;

public class Student {
    private int StudentID;
    private String StudentName;
    private ArrayList<Subject> subjectlist;

    public Student(int ID, String name){
        this.StudentID = ID;
        this.StudentName = name;

        subjectlist = new ArrayList<Subject>();
    }
    public void addSubject(String subname, int score){
        Subject subject = new Subject();
        subject.setSbname(subname);
        subject.setScorePoint(score);
        subjectlist.add(subject);
    }
    public void showInfo(){
        int total = 0;
        for (Subject subject : subjectlist){
            total += subject.getScorePoint();
            System.out.println(StudentName + " 님의 " + subject.getSbname() + " 성적은 " + subject.getScorePoint() + "입니다.");
        }
        System.out.println("총 "+ total +"점 입니다 ");
    }
}
