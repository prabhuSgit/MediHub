/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author prabh
 */
public class AccessApprovalRequest extends WorkRequest{
    private UserAccount useraccount;

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
    
}
