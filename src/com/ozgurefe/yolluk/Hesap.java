package com.ozgurefe.yolluk;

public class Hesap implements IYevmiye{

    Kisi kisi;
    int gosterge, kacKm, seyahatGun; 
    double tasitUcreti; 

    public Hesap(Kisi kisi, int gosterge, int kacKm,double  tasitUcreti, int seyahatGun) {
        this.kisi = kisi;
        this.gosterge=gosterge;      
        this.kacKm=kacKm;
        this.tasitUcreti=tasitUcreti;
        this.seyahatGun=seyahatGun;
    }
    
    public double GostergeBul() {
        if (gosterge==1) {
            return GRUP1; 
        }if(gosterge==2) {
            return GRUP2;
        }if(gosterge==3) {
            return GRUP3;
        }if(gosterge==4) {
            return GRUP4;
        }if(gosterge==5) {
            return GRUP5;
        }
        return 0; 
    }
    
    public double yevmiyeHesap() {
        if (kisi.getAkrabalikDerecesi().equals("Kendisi")) {
            return GostergeBul()*20;
        } else 
            return GostergeBul()*10;
    }
    
    public double yolMesafeUcreti() {
        if (kisi.akrabalikDerecesi.equals("Kendisi")) {
            return (GostergeBul()*5/100)*kacKm;
        } 
        return 0; 
        
    }

    public double getTasitUcreti() {
        return tasitUcreti;
    }
    
    public double Sure() {
        if (seyahatGun>1) {
            return GostergeBul()*2;
        } else return GostergeBul();
    }

    public double Total() {
        return yevmiyeHesap()+yolMesafeUcreti()+getTasitUcreti()+Sure();
    }
}
