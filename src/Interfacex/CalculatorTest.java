package Interfacex;

public class CalculatorTest {
    public static void main(String[] args) {
         int num = 10;
         int num2 = 5;

         Calc calc = new CompleteCalculator();
         CompleteCalculator completeCalculator = new CompleteCalculator();
        System.out.println(calc.div(num,num2));
        completeCalculator.showInfo();

        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
