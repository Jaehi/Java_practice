package Collection;

import java.util.Collection;

public class Member {
    private int memberID;
    private String memberName;

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
}
