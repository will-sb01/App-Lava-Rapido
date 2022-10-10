
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD_DAO {
    public Connection conectaBD(){
        Connection conn = null;
        String url = "jdbc:mysql://db4free.net:3306/bdlava";//"jdbc:mysql://db4free.net:3306/bdlava";
        String user = "will_sb001";
        String password = "87654321";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ConexaoBD_DAO - conectaBD"+ex);
        }
        return conn;
    }
    
}
