/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AppoontmentQueue;

import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author prabh
 */
public class AppointmentRequest {
    private static int appointmentID;
    private Date date;
    private Customer customer;
    private UserAccount doctor;
    private String status;
    private String slot;
    private Enterprise enterprise;
    
    public AppointmentRequest(){
        appointmentID++;
    }

    public static int getAppointmentID() {
        return appointmentID;
    }

    public static void setAppointmentID(int appointmentID) {
        AppointmentRequest.appointmentID = appointmentID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
}
