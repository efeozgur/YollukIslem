package Yolluk;

public class Kisi {

    String adSoyad, unvani, nereden, nereye, akrabalikDerecesi, dairesi, amirAdi, amirUnvani;
    int butceYili;    

    public Kisi(String adSoyad, String unvani, String nereden, String nereye, String akrabalikDerecesi, String dairesi, String amirAdi, String amirUnvani, int butceYili) {
        this.adSoyad = adSoyad;
        this.unvani = unvani;
        this.nereden = nereden;
        this.nereye = nereye;
        this.akrabalikDerecesi = akrabalikDerecesi;
        this.dairesi = dairesi;
        this.amirAdi = amirAdi;
        this.amirUnvani = amirUnvani;
        this.butceYili = butceYili;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getUnvani() {
        return unvani;
    }

    public String getNereden() {
        return nereden;
    }

    public String getNereye() {
        return nereye;
    }

    public String getAkrabalikDerecesi() {
        return akrabalikDerecesi;
    }

    public String getDairesi() {
        return dairesi;
    }

    public String getAmirAdi() {
        return amirAdi;
    }

    public String getAmirUnvani() {
        return amirUnvani;
    }

    public int getButceYili() {
        return butceYili;
    }

    
    
    
}
