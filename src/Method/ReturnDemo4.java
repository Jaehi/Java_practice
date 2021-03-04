package Method;

public class ReturnDemo4 {
    public static String[] getMembers(){
        String[] members = {"이나우","양지완","채보훈"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();
        for (int i = 0; i < members.length; i++){
            System.out.println(members[i]);
        }
    }
}
