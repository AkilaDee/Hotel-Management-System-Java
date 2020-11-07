/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hasini
 */
public class ROOMS {
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    
    // create a function to display all room types in jtable
     public void fillRooms_TYPE_JTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
               row = new Object[3]; 
               row[0] = rs.getInt(1);
               row[1] = rs.getString(2);
               row[2] = rs.getString(3);
               
               tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     
      // create a function to display all rooms in jtable
     public void fillRoomsJTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `rooms`";
        
        try {
            
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
               row = new Object[4]; 
               row[0] = rs.getInt(1);
               row[1] = rs.getInt(2);
               row[2] = rs.getString(3);
               row[3] = rs.getString(4);
               
               tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // create a function to fill a combobox with the rooms-type id
     public void fillRooms_TYPE_JCombobox(JComboBox combobox)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
               combobox.addItem(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     // create a function to add a new room
      public boolean addRoom(int number, int type, String phone)
    {
        PreparedStatement st;
        String addQuery = "INSERT INTO `rooms`(`r_number`, `type`, `phone`, `reserved`) VALUES (?,?,?,?)";
        
        try {
            st = my_connection.createConnection().prepareStatement(addQuery);
            
            st.setInt(1, number);
            st.setInt(2, type);
            st.setString(3, phone);
            // when we add a new room
            // the reserved column will be set to no
            // the reserved column mean i this room is free or not
            st.setString(4, "No");
            
            if(st.executeUpdate() > 0)
            {
                return true;
                
            }else{
                
                return false;
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
      
     // create a function to update a room
    public boolean updateRoom(int number,int type,String phone, String isReserved)
    {
        PreparedStatement st;
        String updateQuery = "UPDATE `rooms` SET `type`=?,`phone`=?,`reserved`=? WHERE `r_number`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(updateQuery);
            
            st.setInt(1, type);
            st.setString(2, phone);
            st.setString(3, isReserved);
            st.setInt(4, number);
            
            return (st.executeUpdate() > 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
   // create a function to delete a room
    public boolean deleteRoom(int roomNumber)
    {
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `rooms` WHERE `r_number`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, roomNumber);
            
            return (st.executeUpdate() > 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }


}
