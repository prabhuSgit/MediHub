/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RegisterationPanels;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.*;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.AdminRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorRegistrationRequest;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class RegisterDoctor extends javax.swing.JPanel {

    /**
     * Creates new form RegisterMedicalSchool
     */
    JPanel userProcessContainer;
    EcoSystem system;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    private Role role;

    public RegisterDoctor(JPanel userProcessContainer, EcoSystem system, Role role) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.role= role;
        populateNetworkComboBox();
        //populateEnterpriseComboBox();
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
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

        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        txtFiledFname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldLname = new javax.swing.JTextField();
        textFieldept = new javax.swing.JTextField();
        txtFieldSSN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        pwsTxt = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 5));
        setMaximumSize(new java.awt.Dimension(602, 390));
        setPreferredSize(new java.awt.Dimension(550, 390));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Doctor Registration");
        add(jLabel1);
        jLabel1.setBounds(200, 30, 244, 36);
        add(txtFiledFname);
        txtFiledFname.setBounds(100, 110, 200, 30);

        jLabel2.setText("First Name:");
        add(jLabel2);
        jLabel2.setBounds(20, 110, 90, 20);

        jLabel3.setText("Last Name:");
        add(jLabel3);
        jLabel3.setBounds(340, 110, 70, 20);

        jLabel4.setText("Department: ");
        add(jLabel4);
        jLabel4.setBounds(20, 150, 90, 20);

        jLabel5.setText("Employee Id");
        add(jLabel5);
        jLabel5.setBounds(20, 190, 90, 20);
        add(textFieldLname);
        textFieldLname.setBounds(410, 110, 200, 30);

        textFieldept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldeptActionPerformed(evt);
            }
        });
        add(textFieldept);
        textFieldept.setBounds(100, 150, 200, 30);
        add(txtFieldSSN);
        txtFieldSSN.setBounds(100, 190, 200, 30);

        jLabel6.setText("Region:");
        add(jLabel6);
        jLabel6.setBounds(20, 240, 90, 20);

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        add(registerBtn);
        registerBtn.setBounds(380, 380, 140, 29);

        jLabel7.setText("Select Provider:");
        add(jLabel7);
        jLabel7.setBounds(20, 280, 90, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1);
        jSeparator1.setBounds(340, 160, 10, 150);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Create:");
        add(jLabel8);
        jLabel8.setBounds(370, 150, 150, 40);

        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        add(userNameTxt);
        userNameTxt.setBounds(460, 190, 140, 30);
        add(pwsTxt);
        pwsTxt.setBounds(460, 240, 140, 30);

        jLabel9.setText("Password:");
        add(jLabel9);
        jLabel9.setBounds(370, 250, 80, 30);

        jLabel10.setText("User Name:");
        add(jLabel10);
        jLabel10.setBounds(370, 190, 80, 30);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(150, 240, 150, 30);

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeJComboBox);
        enterpriseTypeJComboBox.setBounds(150, 280, 150, 30);

        backBtn.setText("<< Back");
        add(backBtn);
        backBtn.setBounds(270, 380, 93, 29);
    }// </editor-fold>//GEN-END:initComponents
    
    private void textFieldeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldeptActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:

        
        if (txtFiledFname.getText().isEmpty() && txtFieldSSN.getText().isEmpty() && textFieldLname.getText().isEmpty() && textFieldept.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill mandatory fields");
        } else {
            System.out.println("Doctor Registration: hi");
            Enterprise ent = (Enterprise) enterpriseTypeJComboBox.getSelectedItem();
            OrganizationDirectory directory = ent.getOrganizationDirectory();
            Organization.Type type = Organization.Type.Doctor;
            Organization org = directory.createOrganization(type);

            Employee empDoctor = org.getEmployeeDirectory().createEmployee(txtFiledFname.toString(), null, null);
            System.out.println("Employee created");
            org.getUserAccountDirectory().createEmployeeAccount(userNameTxt.getText(), pwsTxt.getText(), empDoctor, new DoctorRole());
            System.out.println("User created");

            JOptionPane.showMessageDialog(null, "Request successfully sent to provider \n Your status is Pending");
            RegisterationSelectionJPanel origin = new RegisterationSelectionJPanel(userProcessContainer, system, role);
            userProcessContainer.add("Original Panel", origin);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
       Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void populateEnterpriseComboBox(Network n) {
        enterpriseTypeJComboBox.removeAllItems();
        for (Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseTypeJComboBox.addItem(enterprise);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField pwsTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField textFieldLname;
    private javax.swing.JTextField textFieldept;
    private javax.swing.JTextField txtFieldSSN;
    private javax.swing.JTextField txtFiledFname;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
