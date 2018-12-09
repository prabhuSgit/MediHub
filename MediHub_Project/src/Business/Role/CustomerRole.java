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
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
///import userinterface.CustomerRole.BlankJPanel;
import userinterface.CustomerRole.CustomerSurveyJPanel;
import userinterface.ProviderAdminRole.ProviderWorkAreaJPanel;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author prabh
 */
public class CustomerRole extends Role {
    
    @Override
   public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, UserAccountDirectory directory) {
       JPanel panel = null;
       if (account.getCustomer().getDone() == 1) {
           int i = JOptionPane.showConfirmDialog(null, "Do you want to give Survey for your Last Appointment?");
           if (i == JOptionPane.YES_OPTION) {
              panel = new CustomerSurveyJPanel(userProcessContainer, account, business);
           } else {
               panel = new CustomerWorkAreaJPanel(userProcessContainer, account, business);
           }

       } else {
           panel = new CustomerWorkAreaJPanel(userProcessContainer, account, business);
       }
       return panel;
   }
}
