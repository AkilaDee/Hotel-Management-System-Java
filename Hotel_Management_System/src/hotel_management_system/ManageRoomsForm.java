/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hasini
 */
public class ManageRoomsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoomsForm
     */
    
    ROOMS room = new ROOMS();
    
    public ManageRoomsForm() {
        initComponents();
        
        // display room-Types id in combobox
        room.fillRooms_TYPE_JCombobox(jComboBoxType);
        
        // show all rooms in jtable
        room.fillRoomsJTable(jTable1);
        
        // set a height to the jtable
        jTable1.setRowHeight(30);
        
       // create a button group for the radio buttons
       ButtonGroup bg = new ButtonGroup();
       bg.add(jRadioButtonYes);
       bg.add(jRadioButtonNo);
       
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButtonAddRoom = new javax.swing.JButton();
        jButtonUpdateRoom = new javax.swing.JButton();
        jTextFieldPHONE = new javax.swing.JTextField();
        jButtonDeleteRoom = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonClearField = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonShowRoomTypes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldNumber.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Room Type", "Phone Number", "Reserved?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jLabel3.setText("Type:");

        jButtonAddRoom.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonAddRoom.setText("Add new Room");
        jButtonAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRoomActionPerformed(evt);
            }
        });

        jButtonUpdateRoom.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonUpdateRoom.setText("Update");
        jButtonUpdateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateRoomActionPerformed(evt);
            }
        });

        jTextFieldPHONE.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jButtonDeleteRoom.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonDeleteRoom.setText("Delete");
        jButtonDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteRoomActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Phone No:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jLabel1.setText("Manage Rooms");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("Number:");

        jButtonClearField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonClearField.setText("Clear Fields");
        jButtonClearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldActionPerformed(evt);
            }
        });

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

        jComboBoxType.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jButtonShowRoomTypes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButtonShowRoomTypes.setText("Show Types");
        jButtonShowRoomTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowRoomTypesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("Reserved:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButtonYes.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRadioButtonYes.setText("YES");
        jRadioButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYesActionPerformed(evt);
            }
        });

        jRadioButtonNo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRadioButtonNo.setText("NO");
        jRadioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jRadioButtonYes)
                .addGap(28, 28, 28)
                .addComponent(jRadioButtonNo)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonYes)
                    .addComponent(jRadioButtonNo))
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rooms.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonClearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jButtonShowRoomTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPHONE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAddRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUpdateRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDeleteRoom)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                    .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonShowRoomTypes))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAddRoom)
                            .addComponent(jButtonUpdateRoom)
                            .addComponent(jButtonDeleteRoom))
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        // display the selected row data in the jtexrfields
         
         // get the jtable model
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         
         // get the selected row index
         int rIndex = jTable1.getSelectedRow();
         
         // display data
         jTextFieldNumber.setText(model.getValueAt(rIndex, 0).toString());
         jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1));
         jTextFieldPHONE.setText(model.getValueAt(rIndex, 2).toString());
         
         String isReserved = model.getValueAt(rIndex, 3).toString();
         
         if(isReserved.equals("Yes"))
         {
            jRadioButtonYes.setSelected(true); 
         }
         else if(isReserved.equals("No"))
         {
             jRadioButtonNo.setSelected(true);
         }
    
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRoomActionPerformed
        
        try{
            
            int roomNumber = Integer.valueOf(jTextFieldNumber.getText());
            int roomType = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
            String phone = jTextFieldPHONE.getText();
            
            if(room.addRoom(roomNumber, roomType, phone))
            {
                JOptionPane.showMessageDialog(rootPane, "New Room Added Succesfully", "Add Room", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Room NOT Added", "Add Room Erroe", JOptionPane.ERROR_MESSAGE); 
            }
            
        } catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " -Enter the Rooom number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
                
            }
        

    }//GEN-LAST:event_jButtonAddRoomActionPerformed

    private void jButtonUpdateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateRoomActionPerformed

        // update the selected clients
        
        // get data from the fields
        int roomNumber = 0;
        int type = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
        String phone = jTextFieldPHONE.getText();
        String isReserved = "No";
        
        if(jRadioButtonYes.isSelected())
        {
            isReserved = "Yes";
        }
        
        if(phone.trim().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Enter the Phone Number", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            try{
                roomNumber = Integer.valueOf(jTextFieldNumber.getText());
                
                if(room.updateRoom(roomNumber, type, phone, isReserved))
                {
                    JOptionPane.showMessageDialog(rootPane, "Room Data Updated Succesfully", "Update Room", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else{
                    JOptionPane.showMessageDialog(rootPane, "Room Data Not Updated", "Update Room Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter the Room number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
                
            }
     
        }

    }//GEN-LAST:event_jButtonUpdateRoomActionPerformed

    private void jButtonDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteRoomActionPerformed

         // delete the selected room
        
        try{
                int roomNumber = Integer.valueOf(jTextFieldNumber.getText());
                
                if(room.deleteRoom(roomNumber))
                {
                    JOptionPane.showMessageDialog(rootPane, "Room Deleted Succesfully", "Delete Room", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else{
                    JOptionPane.showMessageDialog(rootPane, "Room Not Deleted ", "Delete Room Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the room number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
                
            }
    }//GEN-LAST:event_jButtonDeleteRoomActionPerformed

    private void jButtonClearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldActionPerformed

        //remove text from all the text fields
        jTextFieldNumber.setText("");
        jTextFieldPHONE.setText("");
        jComboBoxType.setSelectedIndex(0);
        jRadioButtonNo.setSelected(true);
    }//GEN-LAST:event_jButtonClearFieldActionPerformed

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed

        // clear the jtable first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Number","Type","Phone","Reserved"}));

        // populate the jtable
        room.fillRoomsJTable(jTable1);
    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

    private void jButtonShowRoomTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowRoomTypesActionPerformed
        
        ALL_ROOM_TYPE_FORM roomTypesForm = new ALL_ROOM_TYPE_FORM();
        roomTypesForm.setVisible(true);
        roomTypesForm.pack();
        roomTypesForm.setLocationRelativeTo(null);
        roomTypesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButtonShowRoomTypesActionPerformed

    private void jRadioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNoActionPerformed

    private void jRadioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYesActionPerformed

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
            PdfWriter.getInstance(doc, new FileOutputStream(path + "RoomDetails.pdf"));
            
            doc.open();
            
            PdfPTable tbl = new PdfPTable(4);
            
            // Adding headers
            tbl.addCell("Number");
            tbl.addCell("Room Type");
            tbl.addCell("Phone Number");
            tbl.addCell("Reserved?");
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                
                String r_number = jTable1.getValueAt(i, 0).toString();
                String type = jTable1.getValueAt(i, 1).toString();
                String phone = jTable1.getValueAt(i, 2).toString();
                String reserved = jTable1.getValueAt(i, 3).toString();
                
                tbl.addCell(r_number);
                tbl.addCell(type);
                tbl.addCell(phone);
                tbl.addCell(reserved);
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
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddRoom;
    private javax.swing.JButton jButtonClearField;
    private javax.swing.JButton jButtonDeleteRoom;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonShowRoomTypes;
    private javax.swing.JButton jButtonUpdateRoom;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldPHONE;
    // End of variables declaration//GEN-END:variables
}
