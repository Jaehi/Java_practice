package Collection.TreeSet;

import Collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(2,"돌고래");
        Member member2 = new Member(1,"바위고래");
        Member member3 = new Member(3,"rkfwk고래");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);

        memberTreeSet.showAll();
    }
}
