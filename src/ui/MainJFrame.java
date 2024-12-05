/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Business.Admin;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkFlowSystem;
import Business.WorkRequest.DevelopmentWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import ui.Advertising.AdvertisingManager.AdvertisingManagerWorkArea;
import ui.Advertising.DigitalAdsStrategist.DigitalAdsStrategistWorkArea;
import ui.Delivery.DeliveryManager.DeliveryManagerWorkArea;
import ui.Delivery.DeliveryWorkerRole.DeliveryWorkerWorkArea;
import ui.Manufacturing.ManufacturingManager.ManufacturingManagerWorkArea;
import ui.Manufacturing.ManufacturingWorkerRole.ManufacturingWorkerWorkArea;
import ui.Retail.RetailManager.RetailManagerWorkArea;
import ui.SystemAdminWorkAreaJPanel.SystemAdminWorkAreaJPanel;
import ui.Tech.MarketingOrganization.MarketingManagerWorkArea;
import ui.Tech.ProductManager.ProductManagerWorkArea;
import ui.Tech.PurchaseManager.PurchaseManagerWorkArea;
import ui.Tech.RD.RDWorkArea;

/**
 *
 * @author yuanchanglee
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private JPanel container;
    private JTextField userNameField;
    private JPasswordField passwordField;
    private WorkFlowSystem system; // 系統的實例
    private UserAccount loginAccount;
    
    public MainJFrame() {
        system = WorkFlowSystem.getInstance(); // 初始化系統實例
        customizeComponents(); // 自定義元件初始化
        this.setSize(800, 500); // 設置窗口大小
        this.setLocationRelativeTo(null); // 將窗口居中
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customizeComponents() {
        // 主面板，使用 CardLayout 管理多個頁面
        container = new JPanel(new CardLayout());
        getContentPane().add(container); // 添加到主框架

        // 初始化登入面板並添加到主容器
        JPanel loginPanel = createLoginPanel();
        container.add("LoginPanel", loginPanel);

        // 自動調整窗口大小並置中
        pack();
        setLocationRelativeTo(null); // 將窗口置於螢幕中央
    }

    private JPanel createLoginPanel() {
        // 登入面板
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        loginPanel.setBackground(new Color(230, 200, 255));

        // ====== 標題 ======
        JLabel titleLabel = new JLabel("WorkFlow System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 0, 20, 0);
        loginPanel.add(titleLabel, gbc);

        // ====== 用戶名 ======
        JLabel userNameLabel = new JLabel("User Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 0, 5, 10);
        gbc.anchor = GridBagConstraints.LINE_END; // 靠右對齊
        loginPanel.add(userNameLabel, gbc);

        // 初始化 userNameField 成員
        userNameField = new JTextField();
        userNameField.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START; // 靠左對齊
        loginPanel.add(userNameField, gbc);

        // ====== 密碼 ======
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        loginPanel.add(passwordLabel, gbc);

        // 初始化 passwordField 成員
        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        loginPanel.add(passwordField, gbc);

        // ====== 登入按鈕 ======
        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER; // 居中
        gbc.insets = new Insets(20, 0, 5, 0);
        loginPanel.add(loginButton, gbc);

        // ====== 事件處理 ======
        // Update the login button action listener
        loginButton.addActionListener(evt -> {
            String username = userNameField.getText();
            String password = new String(passwordField.getPassword());
            WorkFlowSystem wfs = WorkFlowSystem.getInstance();

            // Check system admin credentials
            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Welcome System Administrator!");
                showSystemAdminPanel(null, true);
                return;
            }

            // First check if it's an enterprise admin
            boolean found = false;
            for (Network network : wfs.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseList()) {
                    Admin enterpriseAdmin = enterprise.getAdmin();
                    // Check enterprise admin credentials
                    if (enterpriseAdmin != null && 
                        username.equals(enterpriseAdmin.getName()) && 
                        password.equals(enterpriseAdmin.getPassword())) {
                        found = true;
                        JOptionPane.showMessageDialog(this, 
                            "Welcome Enterprise Administrator!\n" +
                            "Enterprise: " + enterprise.getName() + 
                            "\nNetwork: " + network.getName());
                        showSystemAdminPanel(enterprise.getAdmin(), false);
                        return;
                    }
                }
            }

            // If not an admin, check regular employee credentials
            for (Network network : wfs.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseList()) {
                    for (UserAccount account : enterprise.getEmployerList()) {
                        if (account.getUsername().equals(username) && 
                            account.getPassword().equals(password)) {
                            found = true;
                            loginAccount = account;

                            // Route to appropriate work area based on organization
                            switch(account.getOrganization().getName()) {
                                case "Product Management" -> showProductManagerWorkAreaPanel(account);
                                case "Research and Development" -> showRDWorkAreaPanel(account);
                                case "Purchasing" -> showPurchaseManagerWorkArea(account);
                                case "Manufacturing Management" -> showManufacturingManagerWorkArea(account);
                                case "Production Line" -> showManufacturingManagerWorkerWorkArea(account);
                                case "Delivery Management" -> showDeliveryManagerWorkerWorkArea(account);
                                case "Delivery" -> showDeliveryWorkerWorkArea(account);
                                case "Retail Sales" -> showRetailManagerWorkArea(account);
                                case "Marketing" -> showMarketingManagerWorkArea(account);
                                case "Planner" -> showAdvertisingManagerWorkArea(account);
                                case "Digital Strategy" -> showDigitalAdsStrategistWorkArea(account);
                            }

                            // Show welcome message
                            String enterpriseInfo = "";
                            switch (enterprise.getType()) {
                                case TECH -> enterpriseInfo = "Technology Enterprise";
                                case MANUFACTURING -> enterpriseInfo = "Manufacturing Enterprise";
                                case DELIVERY -> enterpriseInfo = "Delivery Enterprise";
                                case RETAIL -> enterpriseInfo = "Retail Enterprise";
                                case ADVERTISING -> enterpriseInfo = "Advertising Enterprise";
                            }

                            JOptionPane.showMessageDialog(this, 
                                "Welcome to " + enterprise.getName() + 
                                "\nType: " + enterpriseInfo +
                                "\nNetwork: " + network.getName() +
                                "\nRole: " + account.getRole());
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;
            }

            if (!found) {
                JOptionPane.showMessageDialog(this, 
                    "Invalid credentials. Please try again.",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE);
            }
        });

        return loginPanel;
    }

    private void showSystemAdminPanel(Admin adminAccount, boolean isSystemAdmin) {
        SystemAdminWorkAreaJPanel systemAdminPanel = new SystemAdminWorkAreaJPanel(container, system, this, adminAccount, isSystemAdmin);
        container.add("SystemAdminWorkAreaJPanel", systemAdminPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "SystemAdminWorkAreaJPanel");
    }
    
    private void showProductManagerWorkAreaPanel(UserAccount loginAccount) {
       
        ProductManagerWorkArea productManagerWorkArea = new ProductManagerWorkArea(container,loginAccount, system,this);
        container.add("ProductManagerWorkArea", productManagerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "ProductManagerWorkArea");
    }
    private void showRDWorkAreaPanel(UserAccount loginAccount) {
       
        RDWorkArea rDWorkArea = new RDWorkArea(container,loginAccount, system,this);
        container.add("RDWorkArea", rDWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "RDWorkArea");
    } 
     private void showPurchaseManagerWorkArea(UserAccount loginAccount) {
       
        PurchaseManagerWorkArea purchaseManagerWorkArea = new PurchaseManagerWorkArea(container,loginAccount, system,this);
        container.add("PurchaseManagerWorkArea", purchaseManagerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "PurchaseManagerWorkArea");
    } 
     
      private void showManufacturingManagerWorkArea(UserAccount loginAccount) {
       
       ManufacturingManagerWorkArea manufacturingManagerWorkArea = new ManufacturingManagerWorkArea(container,loginAccount, system,this);
        container.add("ManufacturingManagerWorkArea",  manufacturingManagerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "ManufacturingManagerWorkArea");
    } 
      private void showManufacturingManagerWorkerWorkArea(UserAccount loginAccount) {
       
       ManufacturingWorkerWorkArea manufacturingWorkerWorkArea = new ManufacturingWorkerWorkArea(container,loginAccount, system,this);
        container.add("ManufacturingWorkerWorkArea",  manufacturingWorkerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "ManufacturingWorkerWorkArea");
    } 
      private void showDeliveryManagerWorkerWorkArea(UserAccount loginAccount) {
       
       DeliveryManagerWorkArea deliveryManagerWorkArea = new DeliveryManagerWorkArea(container,loginAccount, system,this);
        container.add("DeliveryManagerWorkArea",  deliveryManagerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "DeliveryManagerWorkArea");
    } 
      
    private void showDeliveryWorkerWorkArea(UserAccount loginAccount) {
        DeliveryWorkerWorkArea deliveryWorkerWorkArea = new DeliveryWorkerWorkArea(container, loginAccount, system, this);
        container.add("DeliveryWorkerWorkArea", deliveryWorkerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "DeliveryWorkerWorkArea");
    }
    
    private void showRetailManagerWorkArea(UserAccount loginAccount) {
        RetailManagerWorkArea retailManagerWorkArea = new RetailManagerWorkArea(container, loginAccount, system,this);
        container.add("RetailManagerWorkArea", retailManagerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "RetailManagerWorkArea");
    }
    
    private void showMarketingManagerWorkArea(UserAccount loginAccount) {
        MarketingManagerWorkArea marketingManagerWorkArea = new MarketingManagerWorkArea(container, loginAccount, system,this);
        container.add("MarketingManagerWorkArea", marketingManagerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "MarketingManagerWorkArea");
    }
    
    private void showAdvertisingManagerWorkArea(UserAccount loginAccount){
        AdvertisingManagerWorkArea advertisingManagerWorkArea = new AdvertisingManagerWorkArea(container, loginAccount, system,this);
        container.add("AdvertisingManagerWorkArea", advertisingManagerWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "AdvertisingManagerWorkArea");
    }
    
    private void showDigitalAdsStrategistWorkArea(UserAccount loginAccount){
        DigitalAdsStrategistWorkArea digitalAdsStrategistWorkArea = new DigitalAdsStrategistWorkArea(container, loginAccount, system, this);
        container.add("DigitalAdsStrategistWorkArea", digitalAdsStrategistWorkArea);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "DigitalAdsStrategistWorkArea");
    }



    public void clearLoginFields() {
        userNameField.setText(""); // 清空帳號欄
        passwordField.setText(""); // 清空密碼欄
    }

    public void showLoginPanel() {
        clearLoginFields(); // 在切換界面前清空欄位
        CardLayout layout = (CardLayout) container.getLayout();
        layout.show(container, "LoginPanel");
    }
    
    


    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
