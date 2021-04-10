package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("sch");
        list.add("gi");
        list.add("ma");
        list.add("mu");

        Stream<String> sstream = list.stream();
        sstream.forEach(s -> System.out.println(s));

//        for (String s : list){
//            System.out.println(s);}

        list.stream().sorted().forEach(s -> System.out.println(s));


        }
    }

