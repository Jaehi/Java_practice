package Object_oriented;

class Calculator3{
    public static void sum(int first,int second){
        System.out.println(first + second);
    }
    public static void avg(int first, int second){
        System.out.println((first+second)/2);
    }
}

public class CalculatorDemo3 {
    public static void avg(int first,int second){
        System.out.println((first+second)/2);
    }
    public static void sum(int first,int second){
        System.out.println(first+second);
    }

    public static void main(String[] args) {
        Calculator3.sum(10,20);
        Calculator3.avg(10,20);

        Calculator3.sum(30,40);
        Calculator3.avg(30,40);
    }
}
