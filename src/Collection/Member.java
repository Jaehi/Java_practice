package Collection;

import java.util.Collection;
import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
    private int memberID;
    private String memberName;

    public Member(){

    }

    public Member(int memberID , String memberName){
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return  memberName + " 회원님의 아이디는 " + memberID + " 입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Member){
            Member member = (Member) o;
            if (this.memberID == member.memberID){
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberID;
    }

    @Override
    public int compareTo(Member member) {
        return (this.memberName.compareTo(member.memberName)*(-1));
    }

    @Override
    public int compare(Member o1, Member o2) {
        return (o1.memberID - o2.memberID) ;
    }
}
