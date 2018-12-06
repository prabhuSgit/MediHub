/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RegisterationPanels;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Role.Role;
import Business.Network.Network;
import Business.Role.Role;
import static Business.Role.Role.RoleType.*;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import javax.swing.JPanel;

/**
 *
 * @author prabh
 */
public class RegisterationSelectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterationSelection
     */
    private JPanel container;
    private Enterprise enterprise;
    JPanel userProcessContainer;

    private EcoSystem system;

    private Role role;

    public RegisterationSelectionJPanel(JPanel userProcessContainer, EcoSystem system, Role role) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.role = role;
        populateComboBox();
    }

    private void populateComboBox() {
        roleJComboBox.removeAllItems();
        for (Role.RoleType type : Role.RoleType.values()) {
            roleJComboBox.addItem(type);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        roleJComboBox = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kindly select the registeration for:");

        nextBtn.setText("Next >");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextBtn)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nextBtn)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

//    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        // TODO add your handling code here:
//    }

    private void registerationSelectionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerationSelectionComboBoxActionPerformed
        // TODO add your handling code here:
        //Place your methods of calling the JPanels based on the slection from the Combo Box :)


    }//GEN-LAST:event_registerationSelectionComboBoxActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:

        Role.RoleType roleType = (Role.RoleType) roleJComboBox.getSelectedItem();

        if (roleJComboBox.getSelectedItem().toString().equals("Health Care Provider")) {
            ProviderRegistrationJPanel provRegPnl = new ProviderRegistrationJPanel(userProcessContainer, system, role);
            userProcessContainer.add("ProviderRegistrationJPanel", provRegPnl);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else if (roleJComboBox.getSelectedItem().equals(LabAssistant)) {
            RegisterLabAssistants assist = new RegisterLabAssistants(userProcessContainer, system, role);
            userProcessContainer.add("LabAssistantRegistrationJPanel", assist);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else if (roleJComboBox.getSelectedItem().equals(Doctor)) {
            RegisterDoctor doctor = new RegisterDoctor(userProcessContainer, system, role);
            userProcessContainer.add("DoctorRegistrationJPanel", doctor);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (roleJComboBox.getSelectedItem().toString().equals("Customer")) {
            RegisterCustomerJPanel regCust = new RegisterCustomerJPanel(userProcessContainer, roleType, system);
            userProcessContainer.add("RegisterCustomerJPanel", regCust);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (roleJComboBox.getSelectedItem().toString().equals("Customer")) {
            RegisterCustomerJPanel regCust = new RegisterCustomerJPanel(userProcessContainer, roleType, system);
            userProcessContainer.add("RegisterCustomerJPanel", regCust);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        System.out.println("on click of next button");
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
            System.out.println(user);
        }
        
    }//GEN-LAST:event_nextBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JComboBox roleJComboBox;
    // End of variables declaration//GEN-END:variables

}
