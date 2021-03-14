package Inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customer = new Customer(100,"나");
        VIPCustomer vipCustomer = new VIPCustomer(101,"너",200);

        int price = customer.calcprice(10000);
        int vprice = vipCustomer.calcprice(10000);

        System.out.println(customer.customerName +"님의 지불 금액은 "+ price +"원 이며 " + customer.showCustomerInfo());
        System.out.println(vipCustomer.customerName +"님의 지불 금액은 "+ vprice +"원 이며 " + vipCustomer.showCustomerInfo());
    }
}
