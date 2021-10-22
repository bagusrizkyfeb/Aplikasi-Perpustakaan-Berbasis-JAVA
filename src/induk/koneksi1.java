/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package induk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class koneksi1 {
    
      Connection conn;
                Statement st;
                ResultSet rs;
                
                public koneksi1() {
                    String isDatabase = "MyDatabase_iacc";
                    String isDatabaseUser = "root";
                    String isDatabasePassword = "";
                    String strConn = "jdbc:mysql://localhost/perpustakaan";
                    try {
                        conn = DriverManager.getConnection(strConn, isDatabaseUser,isDatabasePassword);
                        st = conn.createStatement();
                    } catch (SQLException ex) {
                        System.err.println("Error : " + ex);
                    }
                }
                
            
}
