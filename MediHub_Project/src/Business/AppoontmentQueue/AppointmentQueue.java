/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AppoontmentQueue;

import java.util.ArrayList;

/**
 *
 * @author prabh
 */
public class AppointmentQueue {
    
    private ArrayList<AppointmentRequest> appointmentList;

    public AppointmentQueue() {
        appointmentList = new ArrayList();
    }
    
    public ArrayList<AppointmentRequest> getAppointmentList() {
        return appointmentList;
    }
}
