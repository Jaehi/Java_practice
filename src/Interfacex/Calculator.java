package Interfacex;

public abstract class Calculator implements Calc{
    @Override
    public int add(int num, int num2) {
        return num + num2;
    }

    @Override
    public int sub(int num, int num2) {
        return num - num2;
    }

}
