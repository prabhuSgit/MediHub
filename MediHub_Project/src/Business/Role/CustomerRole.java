/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
<<<<<<< HEAD:MediHub_Project/src/Business/Role/CustomerRole.java
import userinterface.CustomerRole.CustomerWorkAreaJPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
=======
//import userinterface.DoctorRole.DoctorWorkAreaJPanel;
>>>>>>> origin/Urja_Prabhu:MediHub_Project/src/Business/Role/HCProviderRole.java

/**
 *
 * @author prabh
 */
public class CustomerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, UserAccountDirectory directory) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

}
