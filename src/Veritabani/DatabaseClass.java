package Veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/yolluk";
    static final String UserName="root";
    static final String Password="";
    Connection con; 
    Statement stm; 
 

    public void Baglanti() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DB_URL, UserName, Password);
    }
    
    public ResultSet Listele() throws ClassNotFoundException, SQLException{
        Baglanti();
        String sql="select * from kisi";
        stm = con.createStatement();
        ResultSet sonuc = stm.executeQuery(sql);
        
        return sonuc; 
        
        
    }
}
