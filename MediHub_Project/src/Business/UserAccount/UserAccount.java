/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.AppoontmentQueue.AppointmentQueue;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.Customer.Customer;
import Business.OrganQueue.OrganQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Customer customer;
    private Role role;
    private WorkQueue workQueue;
    private AppointmentQueue appointmentQueue;
    private OrganQueue organQueue;
    private String status;

    public UserAccount() {
        workQueue = new WorkQueue();
        appointmentQueue = new AppointmentQueue();
        organQueue = new OrganQueue();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AppointmentQueue getAppointmentQueue() {
        return appointmentQueue;
    }

    public void setAppointmentQueue(AppointmentQueue appointmentQueue) {
        this.appointmentQueue = appointmentQueue;
    }

    public OrganQueue getOrganQueue() {
        return organQueue;
    }

    public void setOrganQueue(OrganQueue organQueue) {
        this.organQueue = organQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}