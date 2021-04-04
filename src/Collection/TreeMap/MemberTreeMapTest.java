package Collection.TreeMap;

import Collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member member1 = new Member(2,"돌고래");
        Member member2 = new Member(1,"바위고래");
        Member member3 = new Member(3,"자갈고래");

        memberTreeMap.addMember(member1);
        memberTreeMap.addMember(member2);
        memberTreeMap.addMember(member3);

        memberTreeMap.showAllMember();


    }
}
