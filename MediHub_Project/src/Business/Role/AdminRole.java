/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import userinterface.RegisterationPanels.ProviderAdminRegistrationWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    @Override
    public JPanel createRegistrationWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        return new ProviderAdminRegistrationWorkAreaJPanel(userProcessContainer, enterprise); 
    }

    
    
}
