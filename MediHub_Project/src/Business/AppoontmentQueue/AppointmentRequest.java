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

    private int appointmentID;
    private static int count = 1;
    private Date date;
    private UserAccount customer;
    private UserAccount doctor;
    private String status;
    private String slot;
    private Enterprise enterprise;

    public AppointmentRequest() {
        appointmentID = count;
        count++;
        date = new Date();
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        AppointmentRequest.count = count;
    }

    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
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

    @Override
    public String toString() {
        return doctor.toString();
    }

}
