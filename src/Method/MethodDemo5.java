package Method;

public class MethodDemo5 {
    public static void numbering(int init, int number){

        while ( init < number){
            System.out.println(init);
            init++;
        }
    }

    public static void main(String[] args) {
        numbering(0,10);
    }
}
