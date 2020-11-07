package hotel_management_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MENU {
    
    MY_CONNECTION my_connection = new MY_CONNECTION(); 
    
    public boolean addMenu(String dish, String cuisine, String price)
    {
        PreparedStatement st;
        String addQuery = "INSERT INTO `menus`(`dish`, `cuisine`, `price`) VALUES (?,?,?)";
        
        try {
            st = my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, dish);
            st.setString(2, cuisine);
            st.setString(3, price);
                        
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
    
    public boolean editMenu(int id,String dish, String cuisine, String price){
        PreparedStatement st;
        String editQuery = "UPDATE `menus` SET `id`=?,`dish`=?,`cuisine`=?,`price`=? WHERE `id`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, dish);
            st.setString(2, cuisine);
            st.setString(3, price);
            st.setInt(4, id);
            
            return (st.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean deleteMenu(int id){
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `menus` WHERE `id`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(deleteQuery);
           
            st.setInt(1, id);
            
            return (st.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
    public void fillMenuJTable(JTable table){
     
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `menus`";
         
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
                        
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
}
