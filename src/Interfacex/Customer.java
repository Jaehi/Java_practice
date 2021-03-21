package Interfacex;

public class Customer implements Buy,Sell{

    @Override
    public void buy() {
        System.out.println("팔기");
    }

    @Override
    public void sell() {
        System.out.println("사기 ");
    }

    @Override
    public void order() {
        System.out.println("고객 판매 주문");
    }
}
