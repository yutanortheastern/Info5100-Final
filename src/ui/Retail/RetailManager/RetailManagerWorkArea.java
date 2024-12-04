/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Retail.RetailManager;

import Business.Organization.Organization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkFlowSystem;
import Business.WorkRequest.DeliverWorkRequest;
import Business.WorkRequest.DevelopmentWorkRequest;
import Business.WorkRequest.PurchaseWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.MainJFrame;

/**
 *
 * @author yuanchanglee
 */
public class RetailManagerWorkArea extends javax.swing.JPanel {
    
    private JPanel container;
    private Organization CurrentOrganization;
    MainJFrame mainFrame;
    WorkFlowSystem system; 
    /**
     * Creates new form RetailManagerWorkArea
     */
    public RetailManagerWorkArea(JPanel container, UserAccount UserAccount, WorkFlowSystem system, MainJFrame mainFrame) {
        initComponents();
        this.container = container;
        this.CurrentOrganization=UserAccount.getOrganization();
        this.mainFrame = mainFrame;
        this.system = system;
        
        populateTable();
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
        btnConfirmDelivery = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Retail Manager Role WorkArea");

        btnConfirmDelivery.setText("Confirm Delivery");
        btnConfirmDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmDeliveryActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "WorkRequest", "OrderName", "ShippingStatus", "ShipFrom", "ShipTo", "ShippingQuantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnLogout)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConfirmDelivery)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmDelivery)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();
        model.setRowCount(0); // 清空表格

        // 獲取當前組織的所有工作請求
        for (WorkRequest request : CurrentOrganization.getWorkQueue().getWorkRequests()) {
            DeliverWorkRequest deliverRequest = request.getDeliverWorkRequest();
            if (deliverRequest != null) { // 確認 deliverRequest 不為 null
                Object[] row = new Object[6];
                row[0] = request;                            // WorkRequest 本身
                row[1] = deliverRequest.getOrderName();      // 訂單名稱
                row[2] = deliverRequest.getShippingStatus(); // 運輸狀態
                row[3] = deliverRequest.getShipFromAddress();// 發貨地址
                row[4] = deliverRequest.getShipToAddress();  // 收貨地址
                row[5] = deliverRequest.getShippingQuantity();// 運輸數量
                model.addRow(row);
            }
        }
    }

    
    private void btnConfirmDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmDeliveryActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWorkRequest.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a WorkRequest first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 從表格中獲取 WorkRequest 對象
        WorkRequest request = (WorkRequest) tblWorkRequest.getValueAt(selectedRowIndex, 0);
        DeliverWorkRequest deliverRequest = request.getDeliverWorkRequest();

        if (deliverRequest == null) {
            JOptionPane.showMessageDialog(this, "No associated DeliverWorkRequest found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 打開 ConfirmDeliveryPanel
        ConfirmDeliveryPanel confirmPanel = new ConfirmDeliveryPanel(container, deliverRequest,system,request);
        container.add("ConfirmDeliveryPanel", confirmPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnConfirmDeliveryActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        mainFrame.showLoginPanel();
        javax.swing.JOptionPane.showMessageDialog(this, "You have been successfully logged out.");
    }//GEN-LAST:event_btnLogoutActionPerformed

    //for demo
    private void populateDemoWorkRequest() {
        
        Product demoProduct = new Product("demoProduct","demoDescription",10,15.3,16,256);
        WorkRequest demoRequest = new WorkRequest("demo",demoProduct);
        demoRequest.setDeliverWorkRequest(new DeliverWorkRequest(demoProduct, "demo", "A", "B",10));
        
        demoRequest.setDevelopmentWorkRequest(new DevelopmentWorkRequest(demoProduct));
        demoRequest.getDevelopmentWorkRequest().setVerified(true);
        demoRequest.setPurchaseWorkRequest(new PurchaseWorkRequest("Demo name"));
        CurrentOrganization.getWorkQueue().addWorkRequest(demoRequest);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmDelivery;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
