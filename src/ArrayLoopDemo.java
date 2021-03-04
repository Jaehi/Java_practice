public class ArrayLoopDemo {
    public static void main(String[] args) {
        String[] classGroup = {"김어쩌구","김저쩌구","나어쩌구","나저쩌구"};

        for (int i = 0; i < classGroup.length; i++){
            String student = classGroup[i];
            System.out.println(student+"학생이 상담을 받았습니다");
        }
    }
}
