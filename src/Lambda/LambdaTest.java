package Lambda;

interface PrintString{
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        PrintString lambdaPrint = str -> {
            System.out.println(str);
        };
        lambdaPrint.showString("ch");
        showPrinting(lambdaPrint);

        PrintString restr = returnPrint();
        restr.showString("ch");
    }
    public static void showPrinting(PrintString lambda){
        lambda.showString("hc");
    }
    public static PrintString returnPrint(){
        return s -> System.out.println(s + "rud");
    }
}
