package Formlar;

import Veritabani.DatabaseClass;
import Yolluk.Hesap;
import Yolluk.Kisi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Anaform extends javax.swing.JFrame {

    DatabaseClass data;
    Kisi kisi;
    Hesap hesap;

    public Anaform() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txAdSoyad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbUnvan = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txNereden = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txNereye = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbAkrabalikDerecesi = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txDairesi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txAmirAdi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txAmirUnvani = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txKm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbGosterge = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txBiletUcret = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbYolculukSuresi = new javax.swing.JComboBox<>();
        btnHesapla = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txYevmiyeSonuc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txMesafeSonuc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txTasitSonuc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txToplamSonuc = new javax.swing.JTextField();
        btnTabloyaAktar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablo = new javax.swing.JTable();
        btnYazdir = new javax.swing.JButton();
        btnGeriAktar = new javax.swing.JButton();
        btnHepsiniSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yolluk Programı");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kişi Bilgileri"));

        jLabel1.setText("Adı Soyadı");

        txAdSoyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txAdSoyadKeyPressed(evt);
            }
        });

        jLabel2.setText("Ünvanı");

        cmbUnvan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hakim / Savcı", "Yazı İşleri Müdürü", "İcra Müdürü", "Zabıt Katibi", "Mübaşir", "Hizmetli" }));

        jLabel3.setText("Nereden");

        jLabel4.setText("Nereye");

        jLabel5.setText("Akrabalık Derecesi");

        cmbAkrabalikDerecesi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kendisi", "Eşi", "Oğlu", "Kızı" }));

        jLabel6.setText("Dairesi");

        jLabel7.setText("Amir Adı");

        jLabel8.setText("Amir Ünvanı");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNereye)
                    .addComponent(txNereden)
                    .addComponent(cmbUnvan, 0, 149, Short.MAX_VALUE)
                    .addComponent(txAdSoyad)
                    .addComponent(cmbAkrabalikDerecesi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txDairesi)
                    .addComponent(txAmirAdi)
                    .addComponent(txAmirUnvani))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txNereden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txNereye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbAkrabalikDerecesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txDairesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txAmirAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txAmirUnvani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesaba Esas Bilgiler"));

        jLabel9.setText("Mesafe (KM Cinsinden)");

        jLabel10.setText("Gösterge");

        cmbGosterge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ek göstergesi 8000 ve daha yüksek", "Ek göstergesi 5800 (dahil) - 8000 (hariç) ", "Ek göstergesi 3000 (dahil) - 5800 (hariç)", "Aylık/kadro derecesi 1-4 ", "Aylık/kadro derecesi 5-15 " }));

        jLabel11.setText("Bilet Ücreti");

        jLabel12.setText("Yolculuk Süresi");

        cmbYolculukSuresi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        btnHesapla.setText("Hesapla");
        btnHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHesaplaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txBiletUcret)
                            .addComponent(cmbYolculukSuresi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txKm)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbGosterge, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 28, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHesapla)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbGosterge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txBiletUcret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbYolculukSuresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHesapla)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesaplama Sonucu"));

        jLabel13.setText("Yevmiye");

        txYevmiyeSonuc.setEditable(false);

        jLabel14.setText("Mesafe Ücreti");

        txMesafeSonuc.setEditable(false);

        jLabel15.setText("Taşıt Ücret");

        txTasitSonuc.setEditable(false);

        jLabel16.setText("Toplam");

        txToplamSonuc.setEditable(false);

        btnTabloyaAktar.setText(">");
        btnTabloyaAktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabloyaAktarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txYevmiyeSonuc)
                    .addComponent(txMesafeSonuc, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txToplamSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTasitSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTabloyaAktar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTabloyaAktar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txYevmiyeSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txTasitSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txMesafeSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txToplamSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Tablo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Adı Soyadı", "Ünvanı", "Gösterge", "Yevmiye", "Yol Ücreti", "Toplam"
            }
        ));
        Tablo.setColumnSelectionAllowed(true);
        Tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablo);
        Tablo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btnYazdir.setText("YAZDIR");

        btnGeriAktar.setText("<");
        btnGeriAktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriAktarActionPerformed(evt);
            }
        });

        btnHepsiniSil.setText("Hepsini Sil");
        btnHepsiniSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHepsiniSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHepsiniSil, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(btnGeriAktar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnYazdir, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnYazdir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnGeriAktar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHepsiniSil)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHesaplaActionPerformed
        try {
            DecimalFormat df = new DecimalFormat("#.##");
            kisi = new Kisi(txAdSoyad.getText(), cmbUnvan.getSelectedItem().toString(), txNereden.getText(), txNereye.getText(), cmbAkrabalikDerecesi.getSelectedItem().toString(), txDairesi.getText(), txAmirAdi.getText(), txAmirUnvani.getText(), 2018);
            hesap = new Hesap(kisi, cmbGosterge.getSelectedIndex() + 1, Integer.parseInt(txKm.getText().toString()), Double.parseDouble(txBiletUcret.getText()), cmbYolculukSuresi.getSelectedIndex() + 1);
            txYevmiyeSonuc.setText(String.valueOf(df.format(hesap.yevmiyeHesap())));
            txMesafeSonuc.setText(String.valueOf(df.format(hesap.yolMesafeUcreti())));
            txTasitSonuc.setText(String.valueOf(df.format(hesap.getTasitUcreti())));
            txToplamSonuc.setText(String.valueOf(df.format(hesap.Total())));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Alanları kontrol edin!");
        }

    }//GEN-LAST:event_btnHesaplaActionPerformed

    private void btnTabloyaAktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabloyaAktarActionPerformed
        if (!txToplamSonuc.getText().equals("")) {
            data = new DatabaseClass();
            try {
                data.Add(kisi, hesap);
                Liste();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Anaform.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Anaform.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Tabloya aktarılacak bilgi yok!!\nBilgiler girildiyse Hesapla butonunu kullanın!");
        }
    }//GEN-LAST:event_btnTabloyaAktarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            Liste();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Anaform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Anaform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void txAdSoyadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAdSoyadKeyPressed
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
            getToolkit().beep();
            //JOptionPane.showMessageDialog(this, "Hata");
        }

    }//GEN-LAST:event_txAdSoyadKeyPressed

    private void TabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabloMouseClicked
        if (evt.getClickCount() == 2) {

        }


    }//GEN-LAST:event_TabloMouseClicked

    private void btnGeriAktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriAktarActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            Object gelenDeger = model.getValueAt(Tablo.getSelectedRow(), 0);

            int yeniDeger = ((Integer) gelenDeger);
            int sonucDegeri = 0;
            data = new DatabaseClass();

            ResultSet gelenKayit = data.kaydiBul(yeniDeger);
            while (gelenKayit.next()) {
                sonucDegeri = gelenKayit.getInt("id");
            }
            data.DeleteRecord(sonucDegeri);
            Liste();

        } catch (SQLException | ClassNotFoundException | ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Listeden kayıt seçin!!");
        }
    }//GEN-LAST:event_btnGeriAktarActionPerformed

    private void btnHepsiniSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHepsiniSilActionPerformed

        try {
            int cevap = JOptionPane.showConfirmDialog(this, "Tüm Kayıtlar Silinecek!!", "Uyarı",2);
            if (cevap == 0) {
                data = new DatabaseClass();
                data.DeleteAllRecord();
                Liste();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Anaform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHepsiniSilActionPerformed

    public void Liste() throws ClassNotFoundException, SQLException {
        data = new DatabaseClass();
        ResultSet listele = data.Listele();
        DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
        model.setRowCount(0);
        while (listele.next()) {
            Object[] eklenecekler = {listele.getInt("id"), listele.getString("adsoyad"), listele.getString("unvan"),
                listele.getString("gosterge"), listele.getString("yevmiye"),
                listele.getString("yolmesafeucret"), listele.getString("total")};
            model.addRow(eklenecekler);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Anaform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anaform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anaform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anaform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anaform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablo;
    private javax.swing.JButton btnGeriAktar;
    private javax.swing.JButton btnHepsiniSil;
    private javax.swing.JButton btnHesapla;
    private javax.swing.JButton btnTabloyaAktar;
    private javax.swing.JButton btnYazdir;
    private javax.swing.JComboBox<String> cmbAkrabalikDerecesi;
    private javax.swing.JComboBox<String> cmbGosterge;
    private javax.swing.JComboBox<String> cmbUnvan;
    private javax.swing.JComboBox<String> cmbYolculukSuresi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txAdSoyad;
    private javax.swing.JTextField txAmirAdi;
    private javax.swing.JTextField txAmirUnvani;
    private javax.swing.JTextField txBiletUcret;
    private javax.swing.JTextField txDairesi;
    private javax.swing.JTextField txKm;
    private javax.swing.JTextField txMesafeSonuc;
    private javax.swing.JTextField txNereden;
    private javax.swing.JTextField txNereye;
    private javax.swing.JTextField txTasitSonuc;
    private javax.swing.JTextField txToplamSonuc;
    private javax.swing.JTextField txYevmiyeSonuc;
    // End of variables declaration//GEN-END:variables
}
