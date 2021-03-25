package Object;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str1 = new String("aa");
        System.out.println(System.identityHashCode(str1));
        StringBuilder builder = new StringBuilder(str1);
        System.out.println(System.identityHashCode(builder));
        builder.append(" bbb");
        builder.append(" ccc");
        System.out.println(System.identityHashCode(builder));
        String str2 = builder.toString();
        System.out.println(str2);
    }
}
