package Collection.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String string1, String string2) {
        return string1.compareTo(string2)*(-1);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(new MyComparator());
        treeSet.add("aaa");
        treeSet.add("bbb");
        treeSet.add("ccc");

        System.out.println(treeSet);
    }
}
