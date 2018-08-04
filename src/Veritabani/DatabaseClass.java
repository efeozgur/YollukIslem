package Veritabani;

import Yolluk.Hesap;
import Yolluk.Kisi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/yolluk?useUnicode=true&characterEncoding=UTF-8";
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
        String sql="select * from kisi order by total desc";
        stm = con.createStatement();
        ResultSet sonuc = stm.executeQuery(sql);
        
        return sonuc; 
    }
    public void Add(Kisi kisi, Hesap hesap) throws ClassNotFoundException, SQLException {
        Baglanti();        
        String sql = "insert into kisi (adsoyad, unvan, nereden, nereye, akrabalikderece, dairesi, amiradi, amirunvani, butceyili, gosterge, km, tasitucret, seyahatgun, yevmiye, yolmesafeucret, sure, total) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, kisi.getAdSoyad());
        pstm.setString(2, kisi.getUnvani());
        pstm.setString(3, kisi.getNereden());
        pstm.setString(4, kisi.getNereye());
        pstm.setString(5, kisi.getAkrabalikDerecesi());
        pstm.setString(6, kisi.getDairesi());
        pstm.setString(7, kisi.getAmirAdi());
        pstm.setString(8, kisi.getAmirUnvani());
        pstm.setInt(9, 2018);
        pstm.setInt(10, hesap.getGosterge());
        pstm.setInt(11, hesap.getKacKm());
        pstm.setDouble(12, hesap.getTasitUcreti());
        pstm.setInt(13, hesap.getSeyahatGun());
        pstm.setDouble(14, hesap.yevmiyeHesap());
        pstm.setDouble(15, hesap.yolMesafeUcreti());
        pstm.setDouble(16, hesap.Sure());
        pstm.setDouble(17, hesap.Total());
        pstm.executeUpdate();
        
    }
   
    public ResultSet kaydiBul(int ID) throws ClassNotFoundException, SQLException {
        Baglanti();
        String sql = "select * from kisi where id ="+ID; 
        int yolla;
        stm = con.createStatement();        
        ResultSet sonuc = stm.executeQuery(sql);
        return sonuc; 
    }
    
    public void DeleteRecord(int id) throws ClassNotFoundException, SQLException {
        Baglanti();
        String sql = "delete from kisi where id="+id;
        stm=con.createStatement();
        stm.executeUpdate(sql);
    }
    
    public void DeleteAllRecord() throws ClassNotFoundException, SQLException {
        Baglanti();
        String sql= "delete from kisi";
        stm = con.createStatement();
        stm.executeUpdate(sql);
    }
}
