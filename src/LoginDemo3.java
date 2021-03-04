public class LoginDemo3 {
    public static void main(String[] args) {
        String id = args[0];
        String psw = args[1];

        if (id.equals("egoing") && psw.equals("010101")){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
}

