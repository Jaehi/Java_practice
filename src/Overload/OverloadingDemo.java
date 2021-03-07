package Overload;

public class OverloadingDemo {
    void A(){
        System.out.println("void A()");
    }

    void A(int arg1){
        System.out.println("void A(int arg1)");
    }

    void A(String arg2){
        System.out.println("void A(String arg2)");
    }

    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1234);
        od.A("헤헷콩~~");
    }
}
