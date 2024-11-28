/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Tech.ProductManager;


import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkFlowSystem;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.MainJFrame;


/**
 *
 * @author User
 */
public class ProductManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ProductManagerWorkArea
     */
    JPanel container;
    Organization CurrentOrganization;
    Organization RDOrganization;
    Organization PurchaseOrganization;
    UserAccount  UserAccount;
    WorkFlowSystem system;
    MainJFrame mainFrame;
    public ProductManagerWorkArea(JPanel container,UserAccount UserAccount,WorkFlowSystem system, MainJFrame mainFrame) {
        initComponents();
        this.container = container;
        this.CurrentOrganization=UserAccount.getOrganization();
        this.system = system;
        this.mainFrame=mainFrame;
        RDOrganization = findRDOrganizationInsystem();
        PurchaseOrganization= findPurchaseOrganizationInsystem();
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnDevProgress = new javax.swing.JButton();
        btnSendtoPurchaseOrganization = new javax.swing.JButton();

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Product Manager Role WorkArea");

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "WorkRequest", "Product", "Status", "DevStatus", "Dev Status Verified"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        jButton1.setText("Start a new WorkReqeust");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDevProgress.setText("View Develop Progress");
        btnDevProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevProgressActionPerformed(evt);
            }
        });

        btnSendtoPurchaseOrganization.setText("Send Reqeust to PurchaseOrganization");
        btnSendtoPurchaseOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendtoPurchaseOrganizationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDevProgress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSendtoPurchaseOrganization)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnDevProgress)
                    .addComponent(btnSendtoPurchaseOrganization))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(426, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        mainFrame.showLoginPanel();
        javax.swing.JOptionPane.showMessageDialog(this, "You have been successfully logged out.");
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CreateNewWorkRequest cnwr = new CreateNewWorkRequest(container, CurrentOrganization,RDOrganization);
        container.add("CreateNewWorkRequest", cnwr);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDevProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevProgressActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWorkRequest.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a WorkRequest first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) tblWorkRequest.getValueAt(selectedRowIndex, 0); 
        
        ViewDevWorkRequest vdwr = new ViewDevWorkRequest(container, CurrentOrganization,request);
        container.add("ReportDevelopeWorkRequest", vdwr);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnDevProgressActionPerformed

    private void btnSendtoPurchaseOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendtoPurchaseOrganizationActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWorkRequest.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a WorkRequest first.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) tblWorkRequest.getValueAt(selectedRowIndex, 0); 
        // When verified is true, passing Workrequest to Purchasing Organization
        // Part2 starting....
        if(request.getDevelopmentWorkRequest().getVerified()==true){
            if(isWorkRequestExist(PurchaseOrganization,request)==true){
            PurchaseOrganization.getWorkQueue().addWorkRequest(request);
            JOptionPane.showMessageDialog(this, "This WorkRequest has been passed to Purchase Organization!");}
            else{JOptionPane.showMessageDialog(this, "This WorkRequest is already existed in Purchase Organization!");
                    return;}
            
        }else{
            JOptionPane.showMessageDialog(this, "The DevWorkRequest is not verified!","Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_btnSendtoPurchaseOrganizationActionPerformed

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : CurrentOrganization.getWorkQueue().getWorkRequests()){
            Object[] row = new Object[5];
            row[0] = request ;
            row[1] = request.getProduct();
            row[2] = request.getStatus();
            if( request.getDevelopmentWorkRequest().getdevStatus()==null){
                row[3]="N/A";
            }
            else{
            row[3] = request.getDevelopmentWorkRequest().getdevStatus();
            }
            row[4] = request.getDevelopmentWorkRequest().getVerified();
           
            model.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevProgress;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSendtoPurchaseOrganization;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables

    private Organization findRDOrganizationInsystem() {
        //遍歷所有network中的enterPrise 直到找到type 是TECH
        //再搜尋當中Organiation 名稱符合的
       for(Network network : system.getNetworkList()){
           for(Enterprise enterprise : network.getEnterpriseList()){
               if(enterprise.getType()==EnterpriseType.TECH){
                   for(Organization organization : enterprise.getOrganizationDirectory()){
                       if(organization.getName()=="Research and Development"){
                           return organization;
                       }
                   }
               }
           }
       }
        return null;// return null if doesn't found
    }
   private Organization findPurchaseOrganizationInsystem() {
        //遍歷所有network中的enterPrise 直到找到type 是TECH
        //再搜尋當中Organiation 名稱符合的
       for(Network network : system.getNetworkList()){
           for(Enterprise enterprise : network.getEnterpriseList()){
               if(enterprise.getType()==EnterpriseType.TECH){
                   for(Organization organization : enterprise.getOrganizationDirectory()){
                       if(organization.getName()=="Purchasing"){
                           return organization;
                       }
                   }
               }
           }
       }
        return null;// return null if doesn't found
    }

    private boolean isWorkRequestExist(Organization Organization,WorkRequest CurrentRequest) {
        for(WorkRequest request : Organization.getWorkQueue().getWorkRequests()){
           if(CurrentRequest==request){
              
               return false;
           }
        }
        return true;
    }
}
