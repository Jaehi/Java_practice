package Interfacex;

public class CompleteCalculator extends Calculator{
    @Override
    public int mul(int num, int num2) {
        return num * num2;
    }

    @Override
    public int div(int num, int num2) {

        if (num2 != 0){
            return num / num2;
        }

        return ERROR;
    }

    public void showInfo(){
        System.out.println("Cacl 인터페이스를 모두 구현하셨습니다. ");
    }
}
