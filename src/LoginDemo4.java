public class LoginDemo4 {
    public static void main(String[] args) {
        String id = args[0];
        String psw = args[1];

        if (id.equals("asdasd") || id.equals("dsadsa") || id.equals("qweqwe") && psw.equals("111111")){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
}
