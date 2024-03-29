/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DB.CRUD;
import Transactions.CustomerTransaction;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import mymedicines.Allergies;
//import mymedicines.BodyPain;
//import mymedicines.Cough;
//import mymedicines.Headache;

/**
 *
 * @author but-anonju_sd2022
 */
public class BuyMed extends javax.swing.JFrame {

    List purchase = new ArrayList();
    CustomerTransaction ct = new CustomerTransaction();
    TransactionPage tp = new TransactionPage();
    String user = tp.getUser();
    String genValue;
    String brandValue;
    double priceValue;
    int availableQtyValue;
    String descValue;
    String medFor;
    int qtyUpdate;
    boolean chicken = false;
    /**
     * Creates new form BuyMed
     */
    public BuyMed() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        medTable.setModel(ct.tableAllergyMed());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        allergyBtn = new javax.swing.JButton();
        bodyPainBtn = new javax.swing.JButton();
        coughBtn = new javax.swing.JButton();
        headacheBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        gnameL = new javax.swing.JLabel();
        bnameL = new javax.swing.JLabel();
        priceL = new javax.swing.JLabel();
        availableQL = new javax.swing.JLabel();
        descriptionL = new javax.swing.JLabel();
        genericNameVal = new javax.swing.JTextField();
        brandnameVal = new javax.swing.JTextField();
        availableQVal = new javax.swing.JTextField();
        priceVal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descVal = new javax.swing.JTextArea();
        inputQtyLabel = new javax.swing.JLabel();
        inputQty = new javax.swing.JTextField();
        viewBtn = new javax.swing.JButton();
        purchaseBtn = new javax.swing.JButton();
        buyLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        allergyBtn.setText("Allergies");
        allergyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allergyBtnMouseClicked(evt);
            }
        });

        bodyPainBtn.setText("Body Pain");
        bodyPainBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bodyPainBtnMouseClicked(evt);
            }
        });

        coughBtn.setText("Cough");
        coughBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coughBtnMouseClicked(evt);
            }
        });

        headacheBtn.setText("Headache");
        headacheBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headacheBtnMouseClicked(evt);
            }
        });

        medTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Generic Name", "Brand Name", "Price ", "Quantiyt Available", "Description"
            }
        ));
        medTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medTable);

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Medicine Details");

        gnameL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        gnameL.setText("Generic Name : ");

        bnameL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bnameL.setText("Brand Name : ");

        priceL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        priceL.setText("Price : ");

        availableQL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        availableQL.setText("Available Quantity : ");

        descriptionL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        descriptionL.setText("Description : ");

        genericNameVal.setEditable(false);

        brandnameVal.setEditable(false);

        availableQVal.setEditable(false);

        priceVal.setEditable(false);

        descVal.setEditable(false);
        descVal.setColumns(20);
        descVal.setRows(5);
        jScrollPane2.setViewportView(descVal);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availableQL)
                    .addComponent(priceL)
                    .addComponent(bnameL)
                    .addComponent(gnameL)
                    .addComponent(descriptionL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genericNameVal)
                    .addComponent(brandnameVal)
                    .addComponent(priceVal)
                    .addComponent(availableQVal, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gnameL)
                    .addComponent(genericNameVal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnameL)
                    .addComponent(brandnameVal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceL)
                    .addComponent(priceVal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableQL)
                    .addComponent(availableQVal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(descriptionL)
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        inputQtyLabel.setBackground(new java.awt.Color(255, 255, 255));
        inputQtyLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        inputQtyLabel.setText("Enter quantity: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(inputQtyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputQty)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputQtyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputQty, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        viewBtn.setText("View Me");
        viewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewBtnMouseClicked(evt);
            }
        });

        purchaseBtn.setText("Purchase Me");
        purchaseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(allergyBtn)
                .addGap(69, 69, 69)
                .addComponent(bodyPainBtn)
                .addGap(76, 76, 76)
                .addComponent(coughBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(headacheBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(purchaseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewBtn)
                        .addGap(62, 62, 62))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allergyBtn)
                    .addComponent(bodyPainBtn)
                    .addComponent(coughBtn)
                    .addComponent(headacheBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewBtn)
                            .addComponent(purchaseBtn))
                        .addGap(22, 22, 22))))
        );

        buyLabel.setBackground(new java.awt.Color(255, 204, 204));
        buyLabel.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        buyLabel.setForeground(new java.awt.Color(255, 204, 204));
        buyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buyLabel.setText("Buy Medicine");

        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn))
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        tp.setVisible(true);
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void allergyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allergyBtnMouseClicked
        // TODO add your handling code here:
//        ct.purchaseAllergyMed(genericName, brandName, quantity);
        medTable.setModel(ct.tableAllergyMed());
        medFor = allergyBtn.getText();

    }//GEN-LAST:event_allergyBtnMouseClicked

    private void bodyPainBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bodyPainBtnMouseClicked
        // TODO add your handling code here:
        medTable.setModel(ct.tableBodyPainMed());
        medFor = bodyPainBtn.getText();
    }//GEN-LAST:event_bodyPainBtnMouseClicked

    private void coughBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coughBtnMouseClicked
        // TODO add your handling code here:
        medTable.setModel(ct.tableCoughMed());
        medFor = coughBtn.getText();
    }//GEN-LAST:event_coughBtnMouseClicked

    private void headacheBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headacheBtnMouseClicked
        // TODO add your handling code here:
        medTable.setModel(ct.tableHeadacheMed());
        medFor = headacheBtn.getText();
    }//GEN-LAST:event_headacheBtnMouseClicked

    private void medTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medTableMouseClicked
        // TODO add your handling code here:
        int row = medTable.getSelectedRow();
        genericNameVal.setText(medTable.getValueAt(row, 0).toString());
        brandnameVal.setText(medTable.getValueAt(row, 1).toString());
        priceVal.setText(medTable.getValueAt(row, 2).toString());
        availableQVal.setText(medTable.getValueAt(row, 4).toString());
        descVal.setText(medTable.getValueAt(row, 3).toString());

        genValue = genericNameVal.getText();
        brandValue = brandnameVal.getText();
        priceValue = Double.parseDouble(priceVal.getText());
        availableQtyValue = Integer.parseInt(availableQVal.getText());
        descValue = descVal.getText();

    }//GEN-LAST:event_medTableMouseClicked

    public void updateData() {
        try {
            Connection conn = new CRUD().connectToDB();

            String updateMed = "UPDATE medicine SET Quantity=" + qtyUpdate
                    + " WHERE GenericName= " + "\"" + genValue + "\"" + ";";
            Statement statement = conn.createStatement();
            statement.executeUpdate(updateMed);
            conn.close();
            JOptionPane.showMessageDialog(rootPane, qtyUpdate);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void purchaseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseBtnMouseClicked
        // TODO add your handling code here:
        if (availableQtyValue > (Integer.parseInt(inputQty.getText()))) { // if quantity available is lesser than the user quantity input
            qtyUpdate = availableQtyValue - Integer.parseInt(inputQty.getText()); // update the quantity to (availble quanty - user quantity input)
        } // 
        try {
            Connection conn = new CRUD().connectToDB();
            double totalAmount = Double.parseDouble(inputQty.getText()) * priceValue;
            String query = "INSERT INTO purchase_history (GenericName,BrandName,Price,Quantity,Description,Total_Amount)"
                    + "VALUES('" + genValue + "','" + brandValue + "','" + priceValue + "','" + (Integer.parseInt(inputQty.getText()))
                    + "','" + descValue + "','" + totalAmount + "')";
            Statement stmt = conn.createStatement();

            if (qtyUpdate > 0 || Integer.parseInt(inputQty.getText()) < availableQtyValue) {
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(rootPane, "Successfully purchased!");
                if(chicken == true) {
                    updateData();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Not Enough supply", "Error", JOptionPane.ERROR_MESSAGE);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_purchaseBtnMouseClicked

    private void viewBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewBtnMouseClicked
        // TODO add your handling code here:
        MyPurchasesHistory mph = new MyPurchasesHistory();
        mph.viewOrders();
        mph.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewBtnMouseClicked

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
            java.util.logging.Logger.getLogger(BuyMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allergyBtn;
    private javax.swing.JLabel availableQL;
    private javax.swing.JTextField availableQVal;
    private javax.swing.JLabel bnameL;
    private javax.swing.JButton bodyPainBtn;
    private javax.swing.JTextField brandnameVal;
    private javax.swing.JLabel buyLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton coughBtn;
    private javax.swing.JTextArea descVal;
    private javax.swing.JLabel descriptionL;
    private javax.swing.JTextField genericNameVal;
    private javax.swing.JLabel gnameL;
    private javax.swing.JButton headacheBtn;
    private javax.swing.JTextField inputQty;
    private javax.swing.JLabel inputQtyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable medTable;
    private javax.swing.JLabel priceL;
    private javax.swing.JTextField priceVal;
    private javax.swing.JButton purchaseBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
