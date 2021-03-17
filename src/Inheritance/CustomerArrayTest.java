package Inheritance;

import java.util.ArrayList;

public class CustomerArrayTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Customer customer = new Customer(100,"볶음밥");
        GoldCustomer gcustomer = new GoldCustomer(101,"야채볶음밥");
        VIPCustomer vcustomer = new VIPCustomer(102,"김치볶음밥",1 );

        customerList.add(customer);
        customerList.add(gcustomer);
        customerList.add(vcustomer);

        int price = 10000;

        for (Customer c : customerList){
            int cost = c.calcprice(price);
            System.out.println(c.getCustomerName() + "님이 "+ cost +"원을 지불하셨습니다.");
            System.out.println(c.showCustomerInfo());
        }
    }
}
