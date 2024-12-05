/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Retail.RetailManager;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkFlowSystem;
import Business.WorkRequest.DeliverWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.Delivery.DeliveryWorkerRole.DeliveryWorkerWorkArea;

/**
 *
 * @author yuanchanglee
 */
public class ConfirmDeliveryPanel extends javax.swing.JPanel {

    
    private JPanel container;
    private DeliverWorkRequest deliverRequest;
    private Network network;
    WorkRequest request;    
    /**
     * Creates new form ConfirmDeliveryPanel
     */
    public ConfirmDeliveryPanel(JPanel container, DeliverWorkRequest deliverRequest, Network Network, WorkRequest request) {
        initComponents();
        
        this.container = container;
        this.deliverRequest = deliverRequest;
        this.request = request;
         this.network = Network;
        initializeShippingStatusComboBox(); // 初始化選項為 true 和 false
        populateDeliveryDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtOrderName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtShipFrom = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtShipTo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTargetQuantity = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmbShippingStatus = new javax.swing.JComboBox<>();
        btnSaveChanges = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Confirm Delivery Detail");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel12.setText("OrderName");

        txtOrderName.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel14.setText("Ship From Address");

        txtShipFrom.setEditable(false);

        txtProductPrice.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        txtProductPrice.setText("Shipping Status");

        txtProductName.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel15.setText("Ship To Address");

        txtShipTo.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel16.setText("Shipping Quantity");

        txtTargetQuantity.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel18.setText("Shipping Confirmed");

        cmbShippingStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbShippingStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbShippingStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductPrice)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOrderName, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(txtProductName)
                            .addComponent(txtShipFrom)
                            .addComponent(txtShipTo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTargetQuantity))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbShippingStatus, 0, 264, Short.MAX_VALUE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShipFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShipTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTargetQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbShippingStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaveChanges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initializeShippingStatusComboBox() {
        cmbShippingStatus.removeAllItems(); // 清空現有選項
        cmbShippingStatus.addItem("true");  // 添加選項 true
        cmbShippingStatus.addItem("false"); // 添加選項 false
    }
    
    private void populateDeliveryDetails() {
        if (deliverRequest == null) {
            JOptionPane.showMessageDialog(this, "No delivery request data available!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 填充表單字段
        txtOrderName.setText(deliverRequest.getOrderName());
        txtProductName.setText(deliverRequest.getProduct().getName());
        txtShipFrom.setText(deliverRequest.getShipFromAddress());
        txtShipTo.setText(deliverRequest.getShipToAddress());
        txtTargetQuantity.setText(String.valueOf(deliverRequest.getShippingQuantity()));
        cmbShippingStatus.setSelectedItem(deliverRequest.getShipConfirmed() ? "true" : "false");
}

    
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length -1];
        RetailManagerWorkArea  retailmanagerWorkArea = (RetailManagerWorkArea) component;
        retailmanagerWorkArea.populateTable();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        try {
                // 獲取選定的 shippingConfirmed 值
                String shippingConfirmed = (String) cmbShippingStatus.getSelectedItem();

                // 檢查是否選擇了值
                if (shippingConfirmed == null) {
                    JOptionPane.showMessageDialog(this, "No shipping status selected.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // 更新 shipping confirmed 狀態
                boolean isConfirmed = "true".equalsIgnoreCase(shippingConfirmed);
                deliverRequest.setShipConfirmed(isConfirmed);

                // 顯示更新結果
                String message = isConfirmed ? "Confirmed" : "Not Confirmed";
                JOptionPane.showMessageDialog(this, "Shipping status updated to: " + message);

                // 如果狀態是確認的，轉發給 Marketing Manager
                if (isConfirmed) {
                    forwardToMarketingOrganization();
                }
            } catch (Exception e) {
                // 捕捉異常並提示用戶
                JOptionPane.showMessageDialog(this, "Error updating shipping status.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void forwardToMarketingOrganization() {
        // 確認 deliverRequest 和 request 不為 null
        if (deliverRequest == null || request == null) {
            JOptionPane.showMessageDialog(this, "DeliverWorkRequest or WorkRequest is null. Cannot forward.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 確認 shipping confirmed 是否為 true
        if (deliverRequest.getShipConfirmed()) {
            // 查找 Marketing Organization
            ArrayList<Organization> marketingOrganizations = findMarketingOrganization();
            for(Organization marketingOrganization : marketingOrganizations){ 
                 if (marketingOrganization != null) {
                    if(isWorkRequestExist(marketingOrganization,request)==true){
                    JOptionPane.showMessageDialog(this, "This WorkRequest is already existed in Marketing Organization!","Warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }   else{ 
                    marketingOrganization.getWorkQueue().addWorkRequest(request);
                    JOptionPane.showMessageDialog(this, "Delivery WorkRequest has been forwarded to Marketing Manager.");
                    }
               
              } else {
                JOptionPane.showMessageDialog(this, "Marketing Organization not found!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            }
           
        } else {
            JOptionPane.showMessageDialog(this, "Shipping is not confirmed. Cannot forward to Marketing Manager.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    
    
    private ArrayList<Organization> findMarketingOrganization() {
               ArrayList<Organization> Organizations = new ArrayList<>();
            for (Enterprise enterprise : network.getEnterpriseList()) {
                if (enterprise.getType() == EnterpriseType.TECH) { // 確保企業類型是 TECH
                    for (Organization org : enterprise.getOrganizationDirectory()) {
                        if (org.getName().equalsIgnoreCase("Marketing")) { // 確保名稱匹配
                            Organizations.add(org);
                        }
                    }
                }
            }
        
        return Organizations;
    }
    
     private boolean isWorkRequestExist(Organization Organization,WorkRequest CurrentRequest) {
            for(WorkRequest request : Organization.getWorkQueue().getWorkRequests()){
                if(CurrentRequest==request){

                    return true;
                }
            }
            return false;
        }
    private void cmbShippingStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbShippingStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbShippingStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JComboBox<String> cmbShippingStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtOrderName;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JLabel txtProductPrice;
    private javax.swing.JTextField txtShipFrom;
    private javax.swing.JTextField txtShipTo;
    private javax.swing.JTextField txtTargetQuantity;
    // End of variables declaration//GEN-END:variables
}
