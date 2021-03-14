package Inheritance;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcprice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며 포인트는 " + bonusPoint + "이 적립되어 있습니다";
     }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
