package Yazdirma;

import Veritabani.DatabaseClass;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Yazdir {

    public void Raporla() throws FileNotFoundException, ClassNotFoundException, SQLException {
        try {
            DatabaseClass db = new DatabaseClass();
            Connection Baglanti = db.Baglanti();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:/jrapor/report2.jasper"));
            JasperPrint print = JasperFillManager.fillReport(bufferedInputStream, null, Baglanti);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            ex.printStackTrace();
        }

    }
}
