package com.example.uygulama1;

public class Araba {
    private String marka;
    private String model;
    private int sonHiz;
    private int AnlikHiz;
    private boolean calisiyorMu;


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSonHiz() {
        return sonHiz;
    }

    public void setSonHiz(int sonHiz) {
        this.sonHiz = sonHiz;
    }

    public int getAnlikHiz() {
        return AnlikHiz;
    }

    public void setAnlikHiz(int AnlikHiz) {
        if(AnlikHiz<=0){ //araç hızının negatif değere düşmesini engelledik.
            this.AnlikHiz=0;
        }
        else if (AnlikHiz>sonHiz) { //arabanın hızını sıfırlandırdık.
            this.AnlikHiz=sonHiz;
        }
       else { // diğer durumlarda hızını belirledik
           this.AnlikHiz=AnlikHiz;
        }
    }

    public boolean isCalisiyorMu() {
        return calisiyorMu;
    }

    public void setCalisiyorMu(boolean calisiyorMu) {
        this.calisiyorMu = calisiyorMu;
    }


    public Araba(String marka, String model, int sonHiz) {
        this.marka = marka;
        this.model = model;
        this.sonHiz = sonHiz;
        this.AnlikHiz=0;
        this.calisiyorMu=false;
    }

    //fonksiyonlarımızı oluşturalım 4 adet fonksiyon oluşturuldu

    public String calistir(){
        if (calisiyorMu){
            return "araba zaten çalışıyor";
        }
        calisiyorMu=true;
        return "araba çalıştırıldı";
    }

    public String durdur(){
        if (AnlikHiz>0){
            return "arabanızın hızı: "+AnlikHiz+"km/h olduğu için durdurulamadı.";
        }
        if (calisiyorMu){
            calisiyorMu=false;
            return "arabanızın durduruldu";
        }
        else {
            return "arabanız zaten durdurulmuş";
        }
    }

    public void hizlan(int hiz){
        if (calisiyorMu){
            setAnlikHiz(AnlikHiz+hiz);
        }
    }

    public void yavasla(int hiz){
        if (calisiyorMu){
            setAnlikHiz(AnlikHiz-hiz);
        }
    }
}
