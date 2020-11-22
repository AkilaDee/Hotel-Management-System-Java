
package hotel_management_system; 

import com.mysql.jdbc.exceptions.MySQLDataException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hasini
 */
public class MY_CONNECTION {
    
    // connection with the mysql database
    
    // mysql connector -> https://dev.mysql.com/downloads/connector/j/5.1.html
    // phpmyadmin -> http://localhost/phpmyadmin/
    
    //function to connect with mysql
    public Connection createConnection() throws MySQLDataException
    {
        Connection connection = null;
        
        MysqlDataSource mds = new MysqlDataSource();
        
        mds.setServerName("localhost");
        mds.setPortNumber(3306);
        mds.setUser("root");      //userid
        mds.setPassword("");
        mds.setDatabaseName("java_hotel_db");
        
        try {
            connection = mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MY_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
}