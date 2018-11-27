/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.RegisterationPanels.ProviderAdminRegistrationWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }

    @Override
    public JPanel createRegistrationWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        return new ProviderAdminRegistrationWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
}
