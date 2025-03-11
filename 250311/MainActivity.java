package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uygulama1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Ulke> ulkeArrayList;
    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ulkeArrayList=new ArrayList<>();

        Ulke australia=new Ulke("Avusturalya","Canberra","İngilizce",2666666,"Avustralya Doları",1,R.drawable.australia);
        Ulke azerbaijan=new Ulke("azerbaycan","Bakü","Azerbaycan Türkçesi",101500,"Azerbaycan Manatı",2,R.drawable.azerbaijan);
        Ulke brazil=new Ulke("Brazilya","Brazilya","Portekizce",211000,"Reali Türk Lirası",3,R.drawable.brazil);
        Ulke greece=new Ulke("Yunanistan","Atina","Yunanca",1041111,"Euro",4,R.drawable.greece);
        Ulke italy=new Ulke("İtalya","Roma","İtalyanca",300328,"İtalyan Lirası",5,R.drawable.italy);
        Ulke japan=new Ulke("Japonya","Tokyo","Japonca",429731,"Japonb yeni",6,R.drawable.japan);
        Ulke tunusia=new Ulke("Tunus","Tunus","Arapça",349839,"Tunus Dinarı",7,R.drawable.tunusia);
        Ulke turkey=new Ulke("Türkiye","Ankara","Türkçe",810000,"Türk lirası",8,R.drawable.turkey);
        Ulke ingiltere=new Ulke("İngiltere","Londra","İngilizce",2647428,"İngiliz Sterlini",9,R.drawable.unitedkingdom);
        Ulke amerika=new Ulke("Amerika","Washington D.C.","İngilizce",863629,"Dolar",10,R.drawable.unitedstates);

        ulkeArrayList.add(australia);
        ulkeArrayList.add(azerbaijan);
        ulkeArrayList.add(brazil);
        ulkeArrayList.add(greece);
        ulkeArrayList.add(italy);
        ulkeArrayList.add(japan);
        ulkeArrayList.add(tunusia);
        ulkeArrayList.add(turkey);
        ulkeArrayList.add(ingiltere);
        ulkeArrayList.add(amerika);

        binding.imageView.setImageResource(ulkeArrayList.get(0).foto);
        binding.textViewAd.setText("Ad: "+ulkeArrayList.get(0).ad);
        binding.textViewBaskent.setText("Başkent: "+ulkeArrayList.get(0).baskent);
        binding.textViewDil.setText("Dil: "+ulkeArrayList.get(0).dil);
        binding.textViewNufus.setText("Nüfus: "+ulkeArrayList.get(0).nufus);
        binding.textViewPara.setText("Para Birimi: "+ulkeArrayList.get(0).parabirimi);
        seciliSiraNo=0;

    }
    public void GeriGelme(View view){
        if (seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageView.setImageResource(ulkeArrayList.get(seciliSiraNo).foto);
            binding.textViewAd.setText("Ad: "+ulkeArrayList.get(seciliSiraNo).ad);
            binding.textViewBaskent.setText("Başkent: "+ulkeArrayList.get(seciliSiraNo).baskent);
            binding.textViewDil.setText("Dil: "+ulkeArrayList.get(seciliSiraNo).dil);
            binding.textViewNufus.setText("Nüfus: "+ulkeArrayList.get(seciliSiraNo).nufus);
            binding.textViewPara.setText("Para Birimi: "+ulkeArrayList.get(seciliSiraNo).parabirimi);
        }
    }
    public void İleriGelme(View view){
        if (seciliSiraNo<ulkeArrayList.size()-1){
            seciliSiraNo++;
            binding.imageView.setImageResource(ulkeArrayList.get(seciliSiraNo).foto);
            binding.textViewAd.setText("Ad: "+ulkeArrayList.get(seciliSiraNo).ad);
            binding.textViewBaskent.setText("Başkent: "+ulkeArrayList.get(seciliSiraNo).baskent);
            binding.textViewDil.setText("Dil: "+ulkeArrayList.get(seciliSiraNo).dil);
            binding.textViewNufus.setText("Nüfus: "+ulkeArrayList.get(seciliSiraNo).nufus);
            binding.textViewPara.setText("Para Birimi: "+ulkeArrayList.get(seciliSiraNo).parabirimi);
        }
    }
}