package com.example.uygulama1;

public class Ulke {
    int bayrak;
    String ad;
    String baskent;
    int nufus;
    String paraBirimi;
    String dil;
    String telefonkodu;
    String aciklama;

    public Ulke(int bayrak, String ad, String baskent, int nufus, String paraBirimi, String dil, String telefonkodu, String aciklama) {
        this.bayrak = bayrak;
        this.ad = ad;
        this.baskent = baskent;
        this.nufus = nufus;
        this.paraBirimi = paraBirimi;
        this.dil = dil;
        this.telefonkodu = telefonkodu;
        this.aciklama = aciklama;
    }

    public int getBayrak() {
        return bayrak;
    }

    public void setBayrak(int bayrak) {
        this.bayrak = bayrak;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBaskent() {
        return baskent;
    }

    public void setBaskent(String baskent) {
        this.baskent = baskent;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }

    public String getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        this.paraBirimi = paraBirimi;
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }

    public String getTelefonkodu() {
        return telefonkodu;
    }

    public void setTelefonkodu(String telefonkodu) {
        this.telefonkodu = telefonkodu;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
