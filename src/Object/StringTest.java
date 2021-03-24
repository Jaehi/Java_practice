package Object;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("String");
        String str2 = new String("String");
        System.out.println(str1 == str2);
        String str3 = "String";
        String str4 = "String";
        System.out.println(str3 == str4);
        String a = new String("AAA");
        System.out.println(System.identityHashCode(a));
        String b = new String("BBB");
        a = a.concat(b);
        System.out.println(System.identityHashCode(a));

    }
}
