package Start;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hi");
        sb.append(" ");
        sb.append("nice to meet you");

        String temp = "";
        temp += "hi";
        temp += " ";
        temp += "yaku";

        StringBuffer bs = new StringBuffer();
        bs.append("apple");
        bs.append(" ");
        bs.append("banana");
        bs.insert(3,"purple");
        String some = bs.substring(3,9).toString();

        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println(temp);

        System.out.println(bs);
        System.out.println(bs.toString());
        System.out.println(some);
    }
}
