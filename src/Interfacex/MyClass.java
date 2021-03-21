package Interfacex;

public class MyClass implements MyInterface{
    @Override
    public void myMethod() {
        System.out.println("myMethod");
    }

    @Override
    public void X() {
        System.out.println("X");
    }

    @Override
    public void Y() {
        System.out.println("Y");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.X();
        myClass.Y();

        X xc = myClass;
        xc.X();

        Y yc = myClass;
        yc.Y();
    }
}
