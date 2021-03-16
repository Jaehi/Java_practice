package Inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(10,"a");
        VIPCustomer vipCustomer = new VIPCustomer(104,"b",22);
        Customer customer1 = new VIPCustomer(111,"c",23);
        GoldCustomer goldCustomer = new GoldCustomer(105,"헤헷코옹");

        customer.calcprice(10000);
        vipCustomer.calcprice(10000);
        customer1.calcprice(10000);
        goldCustomer.calcprice(10000);


        System.out.println(customer.showCustomerInfo());
        System.out.println(vipCustomer.showCustomerInfo());
        System.out.println(customer1.showCustomerInfo());
        System.out.println(goldCustomer.showCustomerInfo());
    }
}
