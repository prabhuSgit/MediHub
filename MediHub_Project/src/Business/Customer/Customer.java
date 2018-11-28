/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.Date;

/**
 *
 * @author prabh
 */
public class Customer {
    private String name;
    private Date dob;
    private String address;
    private Integer phoneNbr;
    private static int custId;
    private int id;
    
    public Customer() {
        id = custId;
        custId++;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(Integer phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public static int getCustId() {
        return custId;
    }

    public static void setCustId(int custId) {
        Customer.custId = custId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
