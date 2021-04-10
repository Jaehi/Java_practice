package Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if (s1.length() <= s2.length())
            return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greeting = {"za","dljjks","tod","wrxg","bhbjRc"};
        System.out.println(Arrays.stream(greeting).reduce("",(s1,s2) -> {
            if (s1.length() >= s2.length())
                return s1;
            else return s2;}
        ));
        String str = Arrays.stream(greeting).reduce(new CompareString()).get();

        System.out.println(str);

    }
}
