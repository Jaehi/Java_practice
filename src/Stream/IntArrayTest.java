package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        IntStream ist = Arrays.stream(arr);
        int sum = ist.sum();
        System.out.println(sum);

        //재사용시 에러
//        int count = (int)ist.count();
//        System.out.println(count);
        int count = (int) Arrays.stream(arr).count();
        System.out.println(count);
    }
}
