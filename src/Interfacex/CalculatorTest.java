package Interfacex;

public class CalculatorTest {
    public static void main(String[] args) {
         int num = 10;
         int num2 = 5;

         Calc calc = new CompleteCalculator();
         CompleteCalculator completeCalculator = new CompleteCalculator();
        System.out.println(calc.div(num,num2));
        completeCalculator.showInfo();
    }
}
