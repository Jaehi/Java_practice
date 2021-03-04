package Method;

public class MethodDemo4 {
    public static void numbering(int limit){
        int i = 0;
        while (i < limit){
            i++;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        numbering(5);
    }
}
