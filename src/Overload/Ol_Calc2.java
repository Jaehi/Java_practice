package Overload;

class Ol_calculator2{
    int[] oprands;

    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }

    public void sum(){
        int total = 0;
        for (int i : oprands){
            total += i;
        }
        System.out.println(total);
    }
    public void avg(){
        int total = 0;
        for (int i : oprands){
            total += i;
        }
        System.out.println(total/ oprands.length);
    }

}

public class Ol_Calc2 {
    public static void main(String[] args) {
        Ol_calculator2 olc = new Ol_calculator2();
        olc.setOprands(new int[]{10,20,30,40});
        olc.sum();
        olc.avg();
    }
}
