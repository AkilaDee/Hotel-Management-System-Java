/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hasini
 */
public class RESERVATION {
    
    // in the reservation table we need to add two foreign keys
    // 1 for the client
    // 2 for the room
    
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
     // create a function to add a new room
      public boolean addReservation(int client_id, int room_number, String dateIn, String dateOut)
    {
        PreparedStatement st;
        String addQuery = "INSERT INTO `reservation`(`client_id`, `room_number`, `date_in`, `date_out`) VALUES (?,?,?,?)";
        
        try {
            st = my_connection.createConnection().prepareStatement(addQuery);
            
            st.setInt(1, client_id);
            st.setInt(2, room_number);
            st.setString(3, dateIn);
            st.setString(4, dateOut);
            
            return (st.executeUpdate() > 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
      
      
     // create a function to update a room
    public boolean updateReservation(int reservation_id, int client_id, int room_number, String dateIn, String dateOut)
    {
        PreparedStatement st;
        String updateQuery = "UPDATE `reservation` SET `client_id`=?,`room_number`=?,`date_in`=?,`date_out`=? WHERE `id`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(updateQuery);
           
            st.setInt(1, client_id);
            st.setInt(2, room_number);
            st.setString(3, dateIn);
            st.setString(4, dateOut);
            st.setInt(5, reservation_id);
            
            return (st.executeUpdate() > 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
    // create a function to delete a reservation
    public boolean deleteReservation(int reservation_id)
    {
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `reservation` WHERE `id`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, reservation_id);
            
            return (st.executeUpdate() > 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
     // create a function to display all rooms in jtable
     public void fillReservationsJTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `reservation`";
        
        try {
            
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
               row = new Object[5]; 
               row[0] = rs.getInt(1);
               row[1] = rs.getInt(2);
               row[2] = rs.getInt(3);
               row[3] = rs.getString(4);
               row[4] = rs.getString(5);
               
               tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
