/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Tech.MarketingOrganization;

import Business.WorkFlowSystem;
import Business.WorkRequest.MarketingWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class VerifyMarketingPlan extends javax.swing.JPanel {

    private JPanel container;
    private MarketingWorkRequest marketingWorkRequest;
    private WorkRequest workRequest;
    /**
     * Creates new form VerifyMarketingPlan
     */
    public VerifyMarketingPlan(JPanel container, MarketingWorkRequest marketingWorkRequest, WorkFlowSystem system, WorkRequest request) {
        initComponents();
        this.container = container;
        this.marketingWorkRequest = marketingWorkRequest;
        this.workRequest = request;

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
        cmbPlanStatus = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        cmbAdsPerformance = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txtPlanName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Quantity = new javax.swing.JLabel();
        txtBudget = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        usedBudget = new javax.swing.JLabel();
        txtUsedBudget = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmbVerify = new javax.swing.JComboBox<>();
        btnSaveChanges = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Verify Marketing Work Request");

        cmbPlanStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPlanStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlanStatusActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel19.setText("Marketing Plan Status");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cmbAdsPerformance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAdsPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAdsPerformanceActionPerformed(evt);
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
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlanName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBudget))))
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

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel20.setText("Ads Performance");

        usedBudget.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        usedBudget.setText("Used Budget");

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel18.setText("Verify Status");

        cmbVerify.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVerifyActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbAdsPerformance, 0, 158, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPlanStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsedBudget)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                        .addContainerGap(284, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbVerify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPlanStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlanStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPlanStatusActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length -1];
        MarketingManagerWorkArea  marketingManagerWorkArea = ( MarketingManagerWorkArea) component;
        marketingManagerWorkArea.populateRequestTable();

        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbAdsPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAdsPerformanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAdsPerformanceActionPerformed

    private void cmbVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVerifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVerifyActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed

        try {
            String verifyStatus = (String) cmbVerify.getSelectedItem();
            if("Completed".equals(verifyStatus) && "Completed".equals(marketingWorkRequest.getAdsExecutionStatus())){
                marketingWorkRequest.setVerified(true);
                marketingWorkRequest.setMarketingPlanStatus("Completed");
                JOptionPane.showMessageDialog(this, "Complete Marketing Work Request.");
                
                if(workRequest.getPurchaseWorkRequest().getVerified()&&
                        workRequest.getDevelopmentWorkRequest().getVerified() &&
                        workRequest.getDeliverWorkRequest().getShipConfirmed() &&
                        workRequest.getMarketingWorkRequest().getVerified()){
                    workRequest.setStatus("Completed");
                    JOptionPane.showMessageDialog(this, workRequest.getName() + " Work flow is all set."
                            , "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                }               
            }
            else{
                marketingWorkRequest.setVerified(false);
                JOptionPane.showMessageDialog(this, "Keep working on Marketing Work Request.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An unexpected error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void populateDetail(){
        txtPlanName.setText(marketingWorkRequest.getMarketingPlanName());
        txtBudget.setText(String.valueOf(marketingWorkRequest.getBudget())); 
        txtUsedBudget.setText(String.valueOf(marketingWorkRequest.getUsedBudget()));
        txtPlanName.setEditable(false);
        txtBudget.setEditable(false);
        txtUsedBudget.setEditable(false);
        
        System.out.println(marketingWorkRequest.getAdsExecutionStatus().toString());
        
        cmbPlanStatus.removeAllItems();
        cmbPlanStatus.addItem("Pending");
        cmbPlanStatus.addItem("Processing");
        cmbPlanStatus.addItem("Completed");
        cmbPlanStatus.addItem("N/A");
        if (marketingWorkRequest.getAdsExecutionStatus().equals("")){
            cmbPlanStatus.setSelectedItem("N/A");
        }
        else{
            cmbPlanStatus.setSelectedItem(marketingWorkRequest.getAdsExecutionStatus());
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
            cmbAdsPerformance.setSelectedItem(marketingWorkRequest.getAdsPerformance());
        }  
        cmbAdsPerformance.setEnabled(false);
        
        cmbVerify.removeAllItems();
        cmbVerify.addItem("Completed");
        cmbVerify.addItem("Ongoing");
        if(marketingWorkRequest.getVerified()){
            cmbVerify.setSelectedItem("Completed");
        }
        else{
            cmbVerify.setSelectedItem("Ongoing");
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quantity;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JComboBox<String> cmbAdsPerformance;
    private javax.swing.JComboBox<String> cmbPlanStatus;
    private javax.swing.JComboBox<String> cmbVerify;
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
