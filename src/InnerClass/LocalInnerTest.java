package InnerClass;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable(int i) {

        int localNum = 300;

        return new Runnable() {

            @Override
            public void run() {
                outNum += 30;
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
                System.out.println(i);

            }
        };
    }
}

public class LocalInnerTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(1);
        runnable.run();

        outer.getRunnable(5).run();
        }
    }

