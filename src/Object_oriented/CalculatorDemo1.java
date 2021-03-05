package Object_oriented;

class Calculator1 {
    static double PI = 3.14;
    int first,second;

    public Calculator1(int first,int second){
        this.first = first;
        this.second = second;
    }
    public void sum(){
        System.out.println(this.first+this.second);
    }
    public void avg(){
        System.out.println((this.first+this.second)/2);
    }

}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1(10,20);

        c1.sum();
        c1.avg();

        System.out.println(c1.PI);
        System.out.println(Calculator1.PI);


    }
}
