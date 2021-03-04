package Start;

public class FourArithmetic {
    /* int a = 5;
    long b = 451284L;
    float c = 1.56F;
    double d = 3.1415926535897; */

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 0;
        int human1 = 160;
        int human2 = 161;
        boolean taller = human1 > human2;
        if (taller){
            System.out.println("두번째 인간이 첫번째 인간보다 키가 큽니다");
        }

        boolean on = true;
        boolean off = false;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%(b+1));
        System.out.println(a*b);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
        System.out.println(on);
        System.out.println(off);
    }

}
