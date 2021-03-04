package Condition;

public class LoginDemo2 {
    public static void main(String[] args) {
        String id = args[0];
        String psw = args[1];

        if (id.equals("egoing")){
            if (psw.equals("010101")){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else{
            System.out.println("wrong");
        }
    }
}
