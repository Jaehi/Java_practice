package Object_oriented;

class Calculator {
    int first,second;

    public void setOprands(int first,int second){
        this.first = first;
        this.second = second;
    }
    public void sum(){
        System.out.println(this.first + this.second);
    }
    public void avg(){
        System.out.println((this.first+this.second)/2);
    }
}

public class CalculatorDemo4 {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Calculator1 c2 = new Calculator1();
        c2.setOprands(30,40);
        c2.sum();
        c2.avg();
    }
}
