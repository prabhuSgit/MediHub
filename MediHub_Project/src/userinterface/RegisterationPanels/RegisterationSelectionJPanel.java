/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RegisterationPanels;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

/**
 *
 * @author prabh
 */
public class RegisterationSelectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterationSelection
     */
    public RegisterationSelectionJPanel() {
        initComponents();
        populateComboBox();
    }
    private void populateComboBox() {
       
        registerationSelectionComboBox.removeAllItems();
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            registerationSelectionComboBox.addItem(type);
        }
        for (Organization.Type type : Organization.Type.values()) {
            registerationSelectionComboBox.addItem(type);
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
        registerationSelectionComboBox = new javax.swing.JComboBox();
        nextBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kindly select the registeration for:");

        registerationSelectionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerationSelectionComboBoxActionPerformed(evt);
            }
        });

        nextBtn.setText("Next >");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

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
                    .addComponent(registerationSelectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(registerationSelectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nextBtn)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerationSelectionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerationSelectionComboBoxActionPerformed
        // TODO add your handling code here:
        //Place your methods of calling the JPanels based on the slection from the Combo Box :)
        
        
    }//GEN-LAST:event_registerationSelectionComboBoxActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
         Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) registerationSelectionComboBox.getSelectedItem();
         //Organization.Type orgtype = (Organization.Type) registerationSelectionComboBox.getSelectedItem();
         
    }//GEN-LAST:event_nextBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JComboBox registerationSelectionComboBox;
    // End of variables declaration//GEN-END:variables
}
