package Collection.HashSet;

import Collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1,"돌고래");
        Member member2 = new Member(2,"바위고래");
        Member member3 = new Member(3,"자갈고래");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        Member member4 = new Member(2,"거위고래");
        memberHashSet.addMember(member4);

        memberHashSet.showAll();
    }
}
