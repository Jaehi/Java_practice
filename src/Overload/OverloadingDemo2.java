package Overload;

public class OverloadingDemo2 extends OverloadingDemo{
    void A(String arg3,String arg4){
        System.out.println("void A(String arg1, String arg2)");
    }
    @Override
    void A() {
        System.out.println("sub : void A()");
    }

    public static void main(String[] args) {
        OverloadingDemo2 od2 = new OverloadingDemo2();
        od2.A();
        od2.A(123);
        od2.A("헤헷콩");
        od2.A("콩헷헤","헷콩헤");
    }
}
