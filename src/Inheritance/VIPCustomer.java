package Inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    private double saleRatio;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public VIPCustomer(int customerID, String customerName, int agentID ){
        super(customerID,customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public int calcprice(int price){
        bonusPoint += price * bonusRatio;

        return price - (int)(price*saleRatio);
    }


    public int getAgentID() {
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 고객님의 상담사 ID는 " + agentID +  " 입니다.";
    }
}
