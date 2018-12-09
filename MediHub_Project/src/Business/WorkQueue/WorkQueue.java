/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<WorkRequest> Organreqlist;

    public WorkQueue() {
        workRequestList = new ArrayList();
        Organreqlist= new ArrayList();
    }

    public ArrayList<WorkRequest> getOrganreqlist() {
        return Organreqlist;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
