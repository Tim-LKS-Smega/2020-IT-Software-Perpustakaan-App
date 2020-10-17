/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Deva Wibowoo
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection GetKoneksi() throws SQLException{
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/db_library";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            } catch(SQLException e){
                System.err.print(e.getStackTrace());
            }
        } return koneksi;
    } 
}
