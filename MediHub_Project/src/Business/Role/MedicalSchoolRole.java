/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

import javax.swing.JPanel;
import userinterface.MedicalSchoolAdminRole.MedicalSchoolWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class MedicalSchoolRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, UserAccountDirectory directory) {
     return new MedicalSchoolWorkAreaJPanel(userProcessContainer, enterprise, account, business);
    }
}
