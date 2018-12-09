/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author prabh
 */

public class Customer extends VitalSigns {

    private String name;
    private String dob;
    private String address;
    private Integer phoneNbr;
    private static int custId;
    private int id;
    private CustomerSurvey customerSurvey;
    private ArrayList<CustomerBooking> customerBookHistrory;
    private int done = 0;

    public Customer() {
        id = custId;
        custId++;
        //this.customerSurveyList = new ArrayList<>();
        this.customerSurvey = new CustomerSurvey();
    }

//    public ArrayList<CustomerSurvey> getCustomerSurveyList() {
//        return customerSurveyList;
//    }
//
//    public void setCustomerSurveyList(ArrayList<CustomerSurvey> customerSurveyList) {
//        this.customerSurveyList = customerSurveyList;
//    }

    public CustomerSurvey getCustomerSurvey() {
        return customerSurvey;
    }

    public void setCustomerSurvey(CustomerSurvey customerSurvey) {
        this.customerSurvey = customerSurvey;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
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

    public ArrayList<CustomerBooking> getCustomerBookHistrory() {
        return customerBookHistrory;
    }

    public void setCustomerBookHistrory(ArrayList<CustomerBooking> customerBookHistrory) {
        this.customerBookHistrory = customerBookHistrory;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return name;
    }

}
