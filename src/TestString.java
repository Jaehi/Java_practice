import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String a = "apple";
        String b = "Apple";
        String c = "apple";
        String d = new String("apple");
        String e = "choco heim";
        String f = "CHOCO HAZELNUT";

        System.out.println(a.equals(b));
        System.out.println(c.equals(a));
        System.out.println(c.equals(d));
        System.out.println(c == d);
        System.out.println(e.indexOf("heim"));
        System.out.println(e.replaceAll("heim","Heim"));
        System.out.println(e.substring(0,10));
        System.out.println(e.toUpperCase());
        System.out.println(f.toLowerCase());
    }
}
