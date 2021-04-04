package Collection.HashMap;

import Collection.Member;
import Collection.TreeSet.MemberTreeSet;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(2,"돌고래");
        Member member2 = new Member(1,"바위고래");
        Member member3 = new Member(3,"자갈고래");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1);
        memberHashMap.showAllMember();
    }
}
