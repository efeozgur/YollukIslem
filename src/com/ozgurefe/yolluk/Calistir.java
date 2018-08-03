package com.ozgurefe.yolluk;

import java.text.DecimalFormat;


public class Calistir {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.##");
        
        Kisi kisi = new Kisi("Seyhan AYDAŞ", "Zabıt Katibi", "Erzurum", "Isparta", "Kendisi", "Adliye", "Ali Haturin", "Başsavcı", 2018);
        
        Hesap hesap = new Hesap(kisi,4,516,80,1);        
        
        System.out.println(format.format(hesap.Total()));
    }
}
