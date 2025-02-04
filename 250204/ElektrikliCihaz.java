package com.example.uygulama1;

public class ElektrikliCihaz {
    public String CihazAdi;
    public double CihazGucu;
    public double GunlukKullanimsaati;
    public double aylikTuketim(){
        double aylikkullanim;
        aylikkullanim=CihazGucu*GunlukKullanimsaati*30*2.07;
        return  aylikkullanim;
    }
}
