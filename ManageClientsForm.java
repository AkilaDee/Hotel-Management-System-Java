/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;

import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hasini
 */
public class ManageClientsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageClientsForm
     */
    
    CLIENT client = new CLIENT();
    
    public ManageClientsForm() {
        initComponents();
        
        // populate the jtable
        client.fillClientJTable(jTable1);
        
         // set a height to the jtable
        jTable1.setRowHeight(30);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPHONE = new javax.swing.JTextField();
        jButtonDeleteClient = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEMAIL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonReport = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldFNAME = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLNAME = new javax.swing.JTextField();
        jButtonAddClient = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonUpdateClient = new javax.swing.JButton();
        jButtonClearField = new javax.swing.JButton();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jTextFieldPHONE.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jButtonDeleteClient.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonDeleteClient.setText("Delete");
        jButtonDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteClientActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Phone No:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jLabel1.setText("Manage Clients");

        jTextFieldEMAIL.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("Email:");

        jButtonReport.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonReport.setText("Report");
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });

        jTextFieldID.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldFNAME.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextFieldFNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFNAMEActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone No", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("First Name:");

        jTextFieldLNAME.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jButtonAddClient.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonAddClient.setText("Add new Client");
        jButtonAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddClientActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Last Name:");

        jButtonUpdateClient.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonUpdateClient.setText("Update");
        jButtonUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateClientActionPerformed(evt);
            }
        });

        jButtonClearField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonClearField.setText("Clear Fields");
        jButtonClearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldActionPerformed(evt);
            }
        });

        jButton_Refresh_JTable_Data.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton_Refresh_JTable_Data.setText("Refresh Table");
        jButton_Refresh_JTable_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_JTable_DataActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clients.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonClearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(89, 89, 89))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(14, 14, 14)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPHONE, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldID)
                                    .addComponent(jTextFieldLNAME)
                                    .addComponent(jTextFieldFNAME)
                                    .addComponent(jTextFieldEMAIL))))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAddClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonUpdateClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDeleteClient))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Refresh_JTable_Data)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddClient)
                    .addComponent(jButtonUpdateClient)
                    .addComponent(jButtonDeleteClient))
                .addGap(26, 26, 26)
                .addComponent(jButtonClearField)
                .addGap(18, 18, 18)
                .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddClientActionPerformed
        
        // add a new client
        
        // get data from the fields
        String fname = jTextFieldFNAME.getText();
        String lname = jTextFieldLNAME.getText();
        String phone = jTextFieldPHONE.getText();
        String email = jTextFieldEMAIL.getText();
        
        if(fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name + The Phone Number", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            if(client.addClient(fname, lname, phone, email))
            {
                JOptionPane.showMessageDialog(rootPane, "New Client Added Succesfully", "Add Client", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Client Not Added", "Add Client Error", JOptionPane.ERROR_MESSAGE);
            }
             
        }
     
    }//GEN-LAST:event_jButtonAddClientActionPerformed

    private void jButtonUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateClientActionPerformed
        
        // update the selected clients
        
        // get data from the fields
        int id = 0;
        String fname = jTextFieldFNAME.getText();
        String lname = jTextFieldLNAME.getText();
        String phone = jTextFieldPHONE.getText();
        String email = jTextFieldEMAIL.getText();
        
        if(fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name + The Phone Number", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            try{
                id = Integer.valueOf(jTextFieldID.getText());
                
                if(client.updateClient(id, fname, lname, phone, email))
                {
                    JOptionPane.showMessageDialog(rootPane, "Client Data Updated Succesfully", "Update Client", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else{
                    JOptionPane.showMessageDialog(rootPane, "Client Data Not Updated", "Update Client Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter the Client ID(number)", "Client ID Error", JOptionPane.ERROR_MESSAGE);
                
            }
     
        }
        
    }//GEN-LAST:event_jButtonUpdateClientActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
         // display the selected row data in the jtexrfields
         
         // get the jtable model
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         
         // get the selected row index
         int rIndex = jTable1.getSelectedRow();
         
         // display data
         jTextFieldID.setText(model.getValueAt(rIndex, 0).toString());
         jTextFieldFNAME.setText(model.getValueAt(rIndex, 1).toString());
         jTextFieldLNAME.setText(model.getValueAt(rIndex, 2).toString());
         jTextFieldPHONE.setText(model.getValueAt(rIndex, 3).toString());
         jTextFieldEMAIL.setText(model.getValueAt(rIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteClientActionPerformed
        
        // delete the selected client
        
        try{
                int id = Integer.valueOf(jTextFieldID.getText());
                
                if(client.deleteClient(id ))
                {
                    JOptionPane.showMessageDialog(rootPane, "Client Deleted Succesfully", "Delete Client", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else{
                    JOptionPane.showMessageDialog(rootPane, "Client Not Deleted ", "Delete Client Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the Client ID(number)", "Client ID Error", JOptionPane.ERROR_MESSAGE);
                
            }
     
    }//GEN-LAST:event_jButtonDeleteClientActionPerformed

    private void jButtonClearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldActionPerformed
        
        //remove text from all the text fields
        jTextFieldID.setText("");
        jTextFieldFNAME.setText("");
        jTextFieldLNAME.setText("");
        jTextFieldPHONE.setText("");
        jTextFieldEMAIL.setText("");
        
    }//GEN-LAST:event_jButtonClearFieldActionPerformed

    private void jTextFieldFNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFNAMEActionPerformed

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed
       
        // clear the jtable first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID","First Name","Last Name","Phone","Email"})); 
        
        // populate the jtable
        client.fillClientJTable(jTable1);
    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

    private void jButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportActionPerformed

        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        
        if(x == JFileChooser.APPROVE_OPTION)
        {
            path =j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "ClientDetails.pdf"));
            
            doc.open();
            
            PdfPTable tbl = new PdfPTable(5);
            
            // Adding headers
            tbl.addCell("Client ID");
            tbl.addCell("First Name");
            tbl.addCell("Last Name");
            tbl.addCell("Phone No");
            tbl.addCell("Email");
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                
                String id = jTable1.getValueAt(i, 0).toString();
                String fname = jTable1.getValueAt(i, 1).toString();
                String lname = jTable1.getValueAt(i, 2).toString();
                String phone = jTable1.getValueAt(i, 3).toString();
                String email = jTable1.getValueAt(i, 4).toString();
                
                tbl.addCell(id);
                tbl.addCell(fname);
                tbl.addCell(lname);
                tbl.addCell(phone);
                tbl.addCell(email);
            }
            
            doc.add(tbl);
            
            JOptionPane.showMessageDialog(null, "Pdf File Downloaded", "ALERT MESSAGE", JOptionPane.WARNING_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManageClientsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ManageClientsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
        
    }//GEN-LAST:event_jButtonReportActionPerformed

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
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClientsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddClient;
    private javax.swing.JButton jButtonClearField;
    private javax.swing.JButton jButtonDeleteClient;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonUpdateClient;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldFNAME;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLNAME;
    private javax.swing.JTextField jTextFieldPHONE;
    // End of variables declaration//GEN-END:variables
}