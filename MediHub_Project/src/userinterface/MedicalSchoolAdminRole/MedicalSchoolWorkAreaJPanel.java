/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalSchoolAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;

import Business.Enterprise.Enterprise;
import Business.Network.Network;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

import Business.Role.Role;
import Business.UserAccount.UserAccount;

import Business.WorkQueue.AccessApprovalRequest;
import Business.OrganQueue.OrganRequest;
import Business.Organization.LabOrganization;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.ReviewRegistrationJPanel;

/**
 *
 * @author hp
 */
public class MedicalSchoolWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    Employee emp;
    Role role;

    /**
     * Creates new form MedicalSchoolWorkAreaJPanel
     */
    public MedicalSchoolWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;

        this.ecoSystem = ecoSystem;
        valueLabel.setText(enterprise.getName());
        userName.setText(userAccount.getUsername());
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy, HH:mm:ss");
        date.setText(sdf.format(cal.getTime()));
        populateComboBOXProvider();
        populateAccessRequestTbl();
        populateOrganRequestTbl();
        populateLabRequest();
    }

    public void populateLabRequest() {
        DefaultTableModel model = (DefaultTableModel) labRqstTable.getModel();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (OrganRequest request : organization.getOrganQueue().getOrganList()) {
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getQty();
                row[2] = request.getStatus();
                row[3] = request.getSender();
                row[4] = request.getSchool();
                row[5] = request.getProvider();
                row[6] = request.getMsg();

                model.addRow(row);
            }
        }

    }

    public void populateAccessRequestTbl() {
        DefaultTableModel model = (DefaultTableModel) accessRequestTbl.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getRole();
            row[2] = request.getStatus();

            model.addRow(row);
        }
    }

    public void populateOrganRequestTbl() {
        DefaultTableModel model = (DefaultTableModel) organRqstTable.getModel();

        Enterprise ent = (Enterprise) enterpriseJComboBox.getSelectedItem();
        model.setRowCount(0);
        for (UserAccount u : ent.getUserAccountDirectory().getUserAccountList()) {
            for (OrganRequest request : u.getOrganQueue().getOrganList()) {
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getQty();
                row[2] = request.getStatus();
                row[3] = request.getSender();
                row[4] = request.getSchool();
                row[5] = request.getProvider();
                row[6] = request.getMsg();

                model.addRow(row);
            }
        }
    }

    public void populateComboBOXProvider() {

        enterpriseJComboBox.removeAllItems();

        for (Network n : ecoSystem.getNetworkList()) {
            if (userAccount.getEmployee().getEnterpriseState().equals(n.toString())) {
                System.out.print(n);
                for (Enterprise enter : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.HealthCareProvider)) {
                        enterpriseJComboBox.addItem(enter);
                    }
                }
            }
        }
    }

//    public void populateQtyComboBox() {
//        QtyBox.removeAllItems();
//        int row = organRqstTable.getSelectedRow();
//        OrganRequest req = (OrganRequest) organRqstTable.getValueAt(row, 2);
//        //for(OrganRequest orgReq : userAccount.getWorkQueue().getOrganreqlist(){
//
//        //}
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReqButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organRqstTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        BtnReview = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        accessRequestTbl = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        organTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        labRqstTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
=======
        QtyBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
>>>>>>> origin/Urja_U

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 5));

        ReqButton.setText("Request Provider");
        ReqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReqButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Provider: ");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 102, 51));
        enterpriseLabel.setText("EnterPrise :");

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

<<<<<<< HEAD
        organRqstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organ", "qty", "Status", "Sender", "Reciever", "Provider", "message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organRqstTable);

        deleteBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\prabh\\MediHub_TheBusinessSquad\\medihub_thebusinesssquad\\MediHub_Project\\images\\deleteBtn.png")); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        BtnReview.setText("Review");
        BtnReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReviewActionPerformed(evt);
            }
        });

        jLabel3.setText("Pending Access requests :");
=======
        valueLabel.setForeground(new java.awt.Color(0, 102, 0));
        valueLabel.setText("jLabel2");
>>>>>>> origin/Urja_U

        accessRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender Name", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(accessRequestTbl);

        labRqstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organ", "qty", "Status", "Sender", "Reciever", "Provider", "message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        labRqstTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labRqstTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(labRqstTable);

<<<<<<< HEAD
        jLabel2.setText("Organ to request:");

        jLabel4.setText("Organs requests from LAB:");

        jLabel5.setText("Organ request sent to Providers:");
=======
        jLabel2.setText("Quantity:");

        QtyBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setBackground(new java.awt.Color(0, 102, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Logged as: ");

        jLabel4.setBackground(new java.awt.Color(0, 102, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Date & Time:");

        userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
>>>>>>> origin/Urja_U

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(deleteBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BtnReview))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(309, 309, 309))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(ReqButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(organTxt)
                                    .addComponent(enterpriseJComboBox, 0, 150, Short.MAX_VALUE))))))
                .addContainerGap(192, Short.MAX_VALUE))
=======
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(QtyBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(ReqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
>>>>>>> origin/Urja_U
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(organTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnReview, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap(23, Short.MAX_VALUE))
=======
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QtyBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(ReqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
>>>>>>> origin/Urja_U
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ReqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReqButtonActionPerformed
        // TODO add your handling code here:
        Enterprise ent = (Enterprise) enterpriseJComboBox.getSelectedItem();
        int row = organRqstTable.getSelectedRow();

        OrganRequest request = new OrganRequest();
        request.setQty(2);
        request.setOrgan(organTxt.getText());
        request.setSender(userAccount);
        request.setStatus("Pending");

        UserAccount u1 = null;
        for (UserAccount u : ent.getUserAccountDirectory().getUserAccountList()) {
            u.getOrganQueue().getOrganList().add(request);
            u1=u;
        }
        populateOrganRequestTbl();

        int row1 = labRqstTable.getSelectedRow();
        OrganRequest request1 = (OrganRequest) labRqstTable.getValueAt(row1, 0);
        request1.setProvider(u1);
        request1.setSchool(userAccount);
        request.setStatus("Sent to Provider"+ " "+u1);
        
        populateLabRequest();
        JOptionPane.showMessageDialog(null, "Request successfully sent to provider \n Your status is Pending");


    }//GEN-LAST:event_ReqButtonActionPerformed

    private void EnterpriseBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpriseBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterpriseBoxActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        int row = accessRequestTbl.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            int dialogButton = JOptionPane.showConfirmDialog(null, "Do you want to Add a Lab request?");
            if (dialogButton == JOptionPane.YES_OPTION) {
                WorkRequest wr = (WorkRequest) accessRequestTbl.getValueAt(row, 0);
                userAccount.getWorkQueue().getWorkRequestList().remove(wr);

                populateAccessRequestTbl();
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void BtnReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReviewActionPerformed
        // TODO add your handling code here:
        int row = accessRequestTbl.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) accessRequestTbl.getValueAt(row, 0);
        UserAccount us = request.getSender();
        //        UserAccount us = (UserAccount)accessRequestTbl.getValueAt(row, 0);
        ReviewRegistrationJPanel reviewRegistrationJPanel = new ReviewRegistrationJPanel(userProcessContainer, ecoSystem, us, userAccount);
        userProcessContainer.add("ViewFlightsPanel", reviewRegistrationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnReviewActionPerformed

    private void labRqstTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labRqstTableMouseClicked
        // TODO add your handling code here:
        int row = labRqstTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String organ = labRqstTable.getValueAt(row, 0).toString();
        organTxt.setText(organ);
    }//GEN-LAST:event_labRqstTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReview;
    private javax.swing.JButton ReqButton;
<<<<<<< HEAD
    private javax.swing.JTable accessRequestTbl;
    private javax.swing.JButton deleteBtn;
=======
    private javax.swing.JLabel date;
>>>>>>> origin/Urja_U
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable labRqstTable;
    private javax.swing.JTable organRqstTable;
    private javax.swing.JTextField organTxt;
=======
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel userName;
>>>>>>> origin/Urja_U
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
