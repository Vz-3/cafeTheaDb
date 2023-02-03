
import Utilities.DatabaseManager;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryce
 */

public class MainHub extends javax.swing.JFrame {

    /**
     * Creates new form MainHub
     */
    DatabaseManager orderDM;
    DefaultTableModel dynModel;
    String tableName = "orderrequest";
    int focusedId;
    public MainHub() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Main Hub");
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        orderDM = new DatabaseManager();
        setOrderTable();
        setFullTable();
        orderRequestFullTable.getTableHeader().setReorderingAllowed(false);
        pendingOrders.getTableHeader().setReorderingAllowed(false);
        checkButtonEnable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void checkButtonEnable() {
        if (orderRequestFullTable.getRowCount()==0) {
            completeBtn.setEnabled(false);
            paidBtn.setEnabled(false);
            cancelledBtn.setEnabled(false);
            pendingBtn.setEnabled(false);
        }
        else {
            completeBtn.setEnabled(true);
            paidBtn.setEnabled(true);
            cancelledBtn.setEnabled(true);
            pendingBtn.setEnabled(true);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ordersTable = new javax.swing.JScrollPane();
        pendingOrders = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        schedScreenTA = new javax.swing.JTextArea();
        OrderServices = new javax.swing.JButton();
        Database = new javax.swing.JButton();
        ViewTransactions = new javax.swing.JButton();
        RequestResupply = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderRequestFullTable = new javax.swing.JTable();
        completeBtn = new javax.swing.JButton();
        paidBtn = new javax.swing.JButton();
        cancelledBtn = new javax.swing.JButton();
        pendingBtn = new javax.swing.JButton();
        focusedLabel = new javax.swing.JLabel();
        focusedField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pendingOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orders", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pendingOrders.getTableHeader().setReorderingAllowed(false);
        pendingOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingOrdersMouseClicked(evt);
            }
        });
        ordersTable.setViewportView(pendingOrders);
        pendingOrders.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (pendingOrders.getColumnModel().getColumnCount() > 0) {
            pendingOrders.getColumnModel().getColumn(0).setResizable(false);
            pendingOrders.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(ordersTable, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 400));

        schedScreenTA.setColumns(20);
        schedScreenTA.setRows(5);
        schedScreenTA.setText("Schedule Screen");
        jScrollPane2.setViewportView(schedScreenTA);

        OrderServices.setText("<html><center>Manage Order<p>and Services</center></html>");
        OrderServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderServicesActionPerformed(evt);
            }
        });

        Database.setText("<html><center>Manage<p>Database</center></html>");
        Database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatabaseActionPerformed(evt);
            }
        });

        ViewTransactions.setText("<html><center>View<p>Transactions</center></html>");

        RequestResupply.setText("<html><center>Request<p>Resupply</center></html>");
        RequestResupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestResupplyActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        orderRequestFullTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        orderRequestFullTable.setRowSelectionAllowed(false);
        orderRequestFullTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderRequestFullTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderRequestFullTable);
        orderRequestFullTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        completeBtn.setText("Complete");

        paidBtn.setText("Paid");

        cancelledBtn.setText("Cancel");

        pendingBtn.setText("Pending");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(focusedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(focusedField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pendingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelledBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paidBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(focusedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(focusedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paidBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(completeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelledBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pendingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(OrderServices, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Database, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RequestResupply, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderServices, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Database, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RequestResupply, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setFullTable() {
        dynModel=(DefaultTableModel)orderRequestFullTable.getModel();
        dynModel.setRowCount(0);
        dynModel.setColumnCount(0);
        try {
            ResultSet deets = orderDM.getTableSet(tableName);
            ResultSetMetaData metadeets = deets.getMetaData();
            if (deets.next()) {
                for (int i = 1;i<=metadeets.getColumnCount();i++) {
                    if (i==1||i==10) {
                        continue;
                    }
                    else
                        dynModel.addColumn(metadeets.getColumnName(i));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void setOrderTable() {
        dynModel=(DefaultTableModel)pendingOrders.getModel();
        dynModel.setRowCount(0);
        try {
//            List<String> data = orderDM.regexQuery(orderDM.selectQuery(tableName, "status", "'pending'"));
            ResultSet deets = orderDM.selectQueryRS(tableName, "status", "'pending'"); 
            ResultSetMetaData metadeets = deets.getMetaData();
            while (deets.next()) { 
                Vector row = new Vector();
                for (int i = 1; i <= metadeets.getColumnCount(); i++) {
                    if (i == 1) {
                         row.add(deets.getString(i));
                    }
                    else if (i == 10) {
                        row.add(deets.getString(i));
                    }
                }
                dynModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        checkButtonEnable();
    }
    private void manageDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDataBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Database database = new Database();
        database.show();
    }//GEN-LAST:event_manageDataBtnActionPerformed

    private void OrderServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderServicesActionPerformed
        // TODO add your handling code here:
        Order order = new Order();
        dispose();
        order.setVisible(true);
    }//GEN-LAST:event_OrderServicesActionPerformed

    private void DatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatabaseActionPerformed
        // TODO add your handling code here:
        DynamicDatabase database = new DynamicDatabase();
        dispose();
        database.setVisible(true);
    }//GEN-LAST:event_DatabaseActionPerformed

    private void RequestResupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestResupplyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RequestResupplyActionPerformed

    private void pendingOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingOrdersMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)pendingOrders.getModel();
        DefaultTableModel model2 = (DefaultTableModel)orderRequestFullTable.getModel();
        
        String id = model.getValueAt(pendingOrders.getSelectedRow(), 0).toString();
        
        List<String> data = orderDM.regexQuery(orderDM.selectId(tableName, id));
        model2.setRowCount(0);
        try {
            ResultSet deets = orderDM.selectId2(tableName, id);
            ResultSetMetaData metadeets = deets.getMetaData();
            if (deets.next()) {
                Vector row = new Vector();
                for (int i = 1;i<=metadeets.getColumnCount();i++) {
                    if (i==1||i==10) {
                        continue;
                    }
                    else
                        row.add(deets.getString(i));
                }
                model2.addRow(row);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        checkButtonEnable();
    }//GEN-LAST:event_pendingOrdersMouseClicked

    private void orderRequestFullTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderRequestFullTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)orderRequestFullTable.getModel();
        focusedField.setText(model.getValueAt(orderRequestFullTable.getSelectedRow(), orderRequestFullTable.getSelectedColumn()).toString());
        focusedLabel.setText(orderRequestFullTable.getColumnName(orderRequestFullTable.getSelectedColumn()));  
    }//GEN-LAST:event_orderRequestFullTableMouseClicked

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
            java.util.logging.Logger.getLogger(MainHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Database;
    private javax.swing.JButton OrderServices;
    private javax.swing.JButton RequestResupply;
    private javax.swing.JButton ViewTransactions;
    private javax.swing.JButton cancelledBtn;
    private javax.swing.JButton completeBtn;
    private javax.swing.JTextField focusedField;
    private javax.swing.JLabel focusedLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderRequestFullTable;
    private javax.swing.JScrollPane ordersTable;
    private javax.swing.JButton paidBtn;
    private javax.swing.JButton pendingBtn;
    private javax.swing.JTable pendingOrders;
    private javax.swing.JTextArea schedScreenTA;
    // End of variables declaration//GEN-END:variables
}
