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
import userinterface.ProviderAdminRole.ProviderWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.MedicalSchoolAdminRole.MedicalSchoolWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{
    
    @Override
   
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, UserAccountDirectory directory) {
       if (account.equals(enterprise.getEnterpriseType().HealthCareProvider)){ 
           return new ProviderWorkAreaJPanel(userProcessContainer, enterprise);
       }
       else if(account.equals(enterprise.getEnterpriseType().MedicalSchool)){
            return new MedicalSchoolWorkAreaJPanel(userProcessContainer, enterprise);
       }
    

