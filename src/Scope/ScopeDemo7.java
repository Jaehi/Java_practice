package Scope;

class C{
    int v = 10;

    void m(){
        System.out.println(v);
    }

}

public class ScopeDemo7 {
    public static void main(String[] args) {
        C c = new C();
        c.m();
    }
}
