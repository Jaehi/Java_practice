package Overload;

class Ol_calculator{
    int first, second;
    int third = 0;

    public void setOprands(int first, int second){
        this.first = first;
        this.second = second;
    }

    public void setOprands(int first,int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void sum(){
        System.out.println(this.first + this.second + this.third);
    }

    public void avg(){
        System.out.println((this.first + this.second + this.third)/2);
    }


}

public class Ol_Clac {
    public static void main(String[] args) {
        Ol_calculator olc = new Ol_calculator();
        olc.setOprands(10,20);
        olc.sum();
        olc.avg();

        Ol_calculator olc2 = new Ol_calculator();
        olc2.setOprands(10,20,30);
        olc2.sum();
        olc2.avg();
    }
}
