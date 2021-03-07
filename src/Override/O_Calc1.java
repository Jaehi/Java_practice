package Override;

class O_claculator{
    int first,second;

    public void setOprands(int first,int second){
        this.first = first;
        this.second = second;
    }

    public void sum(){
        System.out.println(this.first+this.second);
    }

    public int avg(){
        return ((this.first + this.second)/2);
    }

}
class SubCalculator extends O_claculator{
    public void sum(){
        System.out.println("실행 결과는" + (this.first + this.second) + "입니다");
    }
    public int avg(){
        return super.avg();
    }
    public void substract(){
        System.out.println(this.second - this.first);
    }
}

public class O_Calc1 {
    public static void main(String[] args) {
        SubCalculator sc = new SubCalculator();
        sc.setOprands(10,20);
        sc.sum();
        System.out.println(sc.avg());
        sc.substract();
    }
}
