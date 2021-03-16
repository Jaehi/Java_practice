package Inheritance;

public class GoldCustomer extends Customer{
    public GoldCustomer(){
        customerGrade = "GOLD";
        bonusRatio = 0.05;
    }

    public GoldCustomer(int customerID,String customerName){
        super(customerID,customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.05;
    }

    @Override
    public String showCustomerInfo() {

        return customerName + "님의 등급은" + "Gold 다!";
    }
}
