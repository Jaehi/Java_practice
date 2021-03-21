package Interfacex;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999;

    int add (int num, int num2);
    int sub (int num, int num2);
    int mul (int num, int num2);
    int div (int num, int num2);

    default void description(){
        System.out.println("정수 계산기를 구현한다");
    }
    static int total (int[] arr){
        int total = 0;
        for (int i : arr){
            total += i;
        }
        return total;
    }
}
