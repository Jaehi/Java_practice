package Lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        StringConCatImpl str = new StringConCatImpl();
        str.makeString("Hi","rnfkdla");

        StringConcat strc = (s1,s2) -> {
            System.out.println(s1+ " " +s2);
        };
        strc.makeString("Hello","Real");

        StringConcat strc2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };
        strc2.makeString("ma","mu");
    }


}
