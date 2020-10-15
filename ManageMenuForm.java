package hotel_management_system;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ManageMenuForm extends javax.swing.JFrame {

    MENU menu = new MENU();
    public ManageMenuForm() {
        initComponents();
        
        menu.fillMenuJTable(jTable1);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDish = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonClearField = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonReport = new javax.swing.JButton();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jButtonAddDish = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonUpdateDish = new javax.swing.JButton();
        jButtonDeleteDish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCuisine = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldDish.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextFieldDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDishActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("Dish:");

        jButtonClearField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonClearField.setText("Clear Fields");
        jButtonClearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Dish", "Cuisine", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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

        jButtonReport.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonReport.setText("Report");
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });

        jButton_Refresh_JTable_Data.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton_Refresh_JTable_Data.setText("Refresh Table");
        jButton_Refresh_JTable_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_JTable_DataActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("Cuisine:");

        jTextFieldId.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldPrice.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabelId.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelId.setText("ID:");

        jButtonAddDish.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonAddDish.setText("Add New Dish");
        jButtonAddDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDishActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Price:");

        jButtonUpdateDish.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonUpdateDish.setText("Update");
        jButtonUpdateDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateDishActionPerformed(evt);
            }
        });

        jButtonDeleteDish.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonDeleteDish.setText("Delete");
        jButtonDeleteDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteDishActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jLabel1.setText("Manage Menu");

        jTextFieldCuisine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meals.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAddDish)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonUpdateDish)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDeleteDish))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonClearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addGap(97, 97, 97)
                                .addComponent(jTextFieldId))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jTextFieldPrice))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldDish)
                                            .addComponent(jTextFieldCuisine))))))
                        .addGap(19, 19, 19)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldDish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldCuisine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAddDish)
                            .addComponent(jButtonUpdateDish)
                            .addComponent(jButtonDeleteDish))
                        .addGap(26, 26, 26)
                        .addComponent(jButtonClearField)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Refresh_JTable_Data)
                        .addGap(35, 35, 35))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldActionPerformed

        //remove text from all the text fields
        jTextFieldId.setText("");
        jTextFieldDish.setText("");
        jTextFieldCuisine.setText("");
        jTextFieldPrice.setText("");
    }//GEN-LAST:event_jButtonClearFieldActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();
        
        jTextFieldId.setText(model.getValueAt(rIndex,0).toString());
        jTextFieldDish.setText(model.getValueAt(rIndex,1).toString());
        jTextFieldCuisine.setText(model.getValueAt(rIndex,2).toString());
        jTextFieldPrice.setText(model.getValueAt(rIndex,3).toString());
              
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed
        
        jTable1.setModel(new DefaultTableModel(null, new Object [] {"Id","Dish","Cuisine","Price"}));
        menu.fillMenuJTable(jTable1);
    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

    private void jButtonAddDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDishActionPerformed

        String dish = jTextFieldDish.getText();
        String cuisine = jTextFieldCuisine.getText();
        String price = jTextFieldPrice.getText();
       
        if(dish.trim().equals("") || cuisine.trim().equals("") || price.trim().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> Dish/Cuisine + Price", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(menu.addMenu(dish, cuisine, price)){
                JOptionPane.showMessageDialog(rootPane, "New Dish Added Successfully", "Add Dish", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Dish Not Added", "Add Dish Error", JOptionPane.ERROR_MESSAGE);
            }
        }      
    }//GEN-LAST:event_jButtonAddDishActionPerformed

    private void jButtonUpdateDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateDishActionPerformed
         int id = 0;
        String dish = jTextFieldDish.getText();
        String cuisine = jTextFieldCuisine.getText();
        String price = jTextFieldPrice.getText();
   
        if(dish.trim().equals("") || cuisine.trim().equals("") || price.trim().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> Dish/Cuisine + Price", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                id = Integer.valueOf(jTextFieldId.getText());
               
                if(menu.editMenu(id,dish, cuisine, price)){
                    JOptionPane.showMessageDialog(rootPane, "Dish Data Updated Successfully", "Update Dish", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Dish Data Not Updated", "Update Dish Error", JOptionPane.ERROR_MESSAGE);
                }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the Dish Id", "Dish Id Error", JOptionPane.ERROR_MESSAGE);
        }           
       }
    }//GEN-LAST:event_jButtonUpdateDishActionPerformed

    private void jButtonDeleteDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteDishActionPerformed
        try{
            int id = Integer.valueOf(jTextFieldId.getText());
               
            if(menu.deleteMenu(id)){
                JOptionPane.showMessageDialog(rootPane, "Dish Data Deleted Successfully", "Delete Dish", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Dish Not Deleted", "Delete Dish Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the Dish Id", "Dish Id Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeleteDishActionPerformed

    private void jTextFieldDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDishActionPerformed

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
            PdfWriter.getInstance(doc, new FileOutputStream(path + "MenuDetails.pdf"));
            
            doc.open();
            
            PdfPTable tbl = new PdfPTable(4);
            
            // Adding headers
            tbl.addCell("ID");
            tbl.addCell("Dish");
            tbl.addCell("Cuisine");
            tbl.addCell("Price");
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                
                String id = jTable1.getValueAt(i, 0).toString();
                String dish = jTable1.getValueAt(i, 1).toString();
                String cuisine = jTable1.getValueAt(i, 2).toString();
                String price = jTable1.getValueAt(i, 3).toString();
                
                tbl.addCell(id);
                tbl.addCell(dish);
                tbl.addCell(cuisine);
                tbl.addCell(price);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddDish;
    private javax.swing.JButton jButtonClearField;
    private javax.swing.JButton jButtonDeleteDish;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonUpdateDish;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCuisine;
    private javax.swing.JTextField jTextFieldDish;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldPrice;
    // End of variables declaration//GEN-END:variables
}
