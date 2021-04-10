package Lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber maxNum = (x,y) -> (x >= y)? x: y;
        int max = maxNum.getNumber(10,20);
        System.out.println(max);

        MyNumber myNumber = new MyNumber() {
            @Override
            public int getNumber(int num1, int num2) {
                return 0;
            }
        };
    }
}
