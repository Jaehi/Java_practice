package InnerClass;

import java.util.ArrayList;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();

    }

    class InClass{
        int innum = 200;
        int sInNum = 100;

        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }
    }
    public void usingInClass(){
        inClass.inTest();
    }
    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            sNum += 10;
            System.out.println(iNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        static void sTest(){
            System.out.println(sNum);
//            System.out.println(iNum);
            System.out.println(sInNum);
        }
    }
}

public class InnerTest {

    public static void main(String[] args) {
        OutClass outClass = new OutClass();

        outClass.usingInClass();


        OutClass.InClass inClass = outClass.new InClass();

        inClass.inTest();

        OutClass.InStaticClass staticClass = new OutClass.InStaticClass();
        staticClass.inTest();

        OutClass.InStaticClass.sTest();

    }
}
