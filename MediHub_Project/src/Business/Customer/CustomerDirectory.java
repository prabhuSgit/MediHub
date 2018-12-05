/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author prabh
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList = new ArrayList<>();

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(String name, String dob, String address, Integer phoneNbr){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setDob(dob);
        customer.setAddress(address);
        customer.setPhoneNbr(phoneNbr);
        customerList.add(customer);
        return customer;
    }
    
}
