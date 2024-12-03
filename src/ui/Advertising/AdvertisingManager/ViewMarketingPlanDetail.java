/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Advertising.AdvertisingManager;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkFlowSystem;
import Business.WorkRequest.DeliverWorkRequest;
import Business.WorkRequest.MarketingWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ViewMarketingPlanDetail extends javax.swing.JPanel {

    private JPanel container;
    private MarketingWorkRequest marketingWorkRequest;
    private WorkFlowSystem system;
    WorkRequest request;
    Organization DigitalStrategyOrganization;
    /**
     * Creates new form ViewMarketingPlanDetail
     */
    public ViewMarketingPlanDetail(JPanel container, MarketingWorkRequest marketingWorkRequest, WorkFlowSystem system, WorkRequest request) {
        initComponents();
        this.container = container;
        this.marketingWorkRequest = marketingWorkRequest;
        this.system = system;
        this.request = request;
        this.DigitalStrategyOrganization = findDigitalStrategyOrganization();
        populateDetail();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPlanName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Quantity = new javax.swing.JLabel();
        txtBudget = new javax.swing.JTextField();
        btnSaveChanges = new javax.swing.JButton();
        cmbPlanStatus = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cmbAdsPerformance = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        usedBudget = new javax.swing.JLabel();
        txtUsedBudget = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmbSignedStatus = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(564, 238));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Review Marketing Plan");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel12.setText("Plan Name");

        Quantity.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        Quantity.setText("Budget");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlanName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBudget)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlanName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        cmbPlanStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPlanStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlanStatusActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel19.setText("Marketing Plan Status");

        cmbAdsPerformance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAdsPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAdsPerformanceActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel20.setText("Ads Performance");

        usedBudget.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        usedBudget.setText("Used Budget");

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel18.setText("Sign Budget");

        cmbSignedStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSignedStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSignedStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbAdsPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPlanStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 77, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSignedStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPlanStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAdsPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSignedStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //        container.remove(this);
        //        Component[] componentArray = container.getComponents();
        //        Component component = componentArray[componentArray.length -1];
        //        ManufacturingManagerWorkArea  manufacturingManagerWorkArea = ( ManufacturingManagerWorkArea) component;
        //        manufacturingManagerWorkArea.populateRequestTable();
        //
        //        CardLayout layout = (CardLayout)container.getLayout();
        //        layout.previous(container);
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed

        try {
            String signedStatus = (String) cmbSignedStatus.getSelectedItem();
            if ("Accept".equals(signedStatus)) {
                marketingWorkRequest.setSigned(true); 
                JOptionPane.showMessageDialog(this, "Budget approved for the plan.");
                DigitalStrategyOrganization.getWorkQueue().addWorkRequest(request);
                JOptionPane.showMessageDialog(this, "This WorkRequest has been passed to Digital Strategy Organization!");              
            } 
            else if ("Reject".equals(signedStatus)) {
                marketingWorkRequest.setSigned(false); 
                JOptionPane.showMessageDialog(this, "Budget rejected. Set the budget again.");
            }           
            marketingWorkRequest.setBudget(Integer.parseInt(txtBudget.getText()));
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Input.", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void cmbPlanStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlanStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPlanStatusActionPerformed

    private void cmbAdsPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAdsPerformanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAdsPerformanceActionPerformed

    private void cmbSignedStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSignedStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSignedStatusActionPerformed
  
    private void populateDetail(){
        txtPlanName.setText(marketingWorkRequest.getMarketingPlanName());
        txtBudget.setText(String.valueOf(marketingWorkRequest.getBudget())); 
        txtUsedBudget.setText(String.valueOf(marketingWorkRequest.getUsedBudget()));
        txtPlanName.setEditable(false);
        txtBudget.setEditable(false);
        txtUsedBudget.setEditable(false);
        
        cmbPlanStatus.removeAllItems();
        cmbPlanStatus.addItem("Pending");
        cmbPlanStatus.addItem("Processing");
        cmbPlanStatus.addItem("Completed");
        cmbPlanStatus.addItem("N/A");
        if (marketingWorkRequest.getAdsExecutionStatus().equals("")){
            cmbPlanStatus.setSelectedItem("N/A");
        }
        else{
            cmbPlanStatus.setSelectedItem(marketingWorkRequest.getAdsExecutionStatus().toString());
        }     
        cmbPlanStatus.setEnabled(false);
        
        
        cmbAdsPerformance.removeAllItems();
        cmbAdsPerformance.addItem("Excellent");
        cmbAdsPerformance.addItem("Average");
        cmbAdsPerformance.addItem("Poor");
        cmbAdsPerformance.addItem("N/A");
        if (marketingWorkRequest.getAdsPerformance().equals("")){
            cmbAdsPerformance.setSelectedItem("N/A");
        }
        else{
            cmbAdsPerformance.setSelectedItem(marketingWorkRequest.getAdsPerformance().toString());
        }  
        cmbAdsPerformance.setEnabled(false);
        
        cmbSignedStatus.removeAllItems();
        cmbSignedStatus.addItem("Accept");
        cmbSignedStatus.addItem("Reject");
        cmbPlanStatus.setSelectedItem(marketingWorkRequest.getSigned());
    }
    
    private Organization findDigitalStrategyOrganization() {
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseList()) {
                if (enterprise.getType() == EnterpriseType.ADVERTISING) {
                    for (Organization org : enterprise.getOrganizationDirectory()) {
                        if (org.getName().equalsIgnoreCase("Digital Strategy")) {
                            return org;
                        }
                    }
                }
            }
        }
        return null;
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quantity;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JComboBox<String> cmbAdsPerformance;
    private javax.swing.JComboBox<String> cmbPlanStatus;
    private javax.swing.JComboBox<String> cmbSignedStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBudget;
    private javax.swing.JTextField txtPlanName;
    private javax.swing.JTextField txtUsedBudget;
    private javax.swing.JLabel usedBudget;
    // End of variables declaration//GEN-END:variables
}
