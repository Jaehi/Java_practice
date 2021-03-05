package Object_oriented;

class Calculator2{
    static double PI = 3.14;
    static int base = 0;
    int first,second;

    public void setOprands(int first,int second){
        this.first = first;
        this.second = second;
    }

    public void sum(){
        System.out.println(first + second + base);
    }

    public void avg(){
        System.out.println((this.first + this.second)/2);
    }
}

public class CalculatorDemo2 {

    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10,20);
        c1.sum();

        Calculator2 c2 = new Calculator2();
        c2.setOprands(30,40);
        c2.sum();

        Calculator2.base = 10;

        c1.sum();
        c2.sum();

    }

}
