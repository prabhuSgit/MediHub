/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganQueue;

import java.util.ArrayList;

/**
 *
 * @author prabh
 */
public class OrganQueue {
    private ArrayList<OrganRequest> organList;

    public OrganQueue() {
        organList = new ArrayList();
    }

    public ArrayList<OrganRequest> getOrganList() {
        return organList;
    }
    
}
