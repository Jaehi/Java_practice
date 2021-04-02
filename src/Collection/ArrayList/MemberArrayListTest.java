package Collection.ArrayList;

import Collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1,"돌고래");
        Member member2 = new Member(2,"바위고래");
        Member member3 = new Member(3,"자갈고래");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);

        memberArrayList.showAll();

        memberArrayList.removeMember(2);

        memberArrayList.showAll();
    }
}
