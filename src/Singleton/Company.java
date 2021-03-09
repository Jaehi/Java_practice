package Singleton;

class CompanyEx{
    private static CompanyEx instance = new CompanyEx();
    private CompanyEx(){
    }
    public static CompanyEx getInstance(){
        return instance;
    }
}

public class Company {
    public static void main(String[] args) {
        CompanyEx c1 = CompanyEx.getInstance();
        CompanyEx c2 = CompanyEx.getInstance();

        System.out.println(c1);
        System.out.println(c2);
    }
}
