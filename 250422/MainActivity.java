package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Ulke> ulkeler;
    ListView lvUlkeler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ulkeler=new ArrayList<>();

        lvUlkeler=findViewById(R.id.lv_ulkeler);
        ulkeler.add(new Ulke(R.drawable.turkiye,"Türkiye","Ankara",8000000,"TL","Türkçe","+90",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.almanya,"Almanya","Berlin",8300000,"Mark","Almanca","+49",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.abd,"Amerika","Washington ",3400000,"Dolar","İngilizce","+1",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.iran,"İran","Tahran",9000000,"İran Riyali","Tahranî Farsçası","+98",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.kanada,"Kanada","Attova",4000000,"Dolar","Fransızca","+1",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.norvec,"Norveç","Oslo",5000000,"Norveç Kronu","Norveççe","+47",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.pakistan,"Pakistan","İslamabad",2470000,"Pakistan Rupisi","Urduca","+92",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.tanzanya,"Tanzanya","Dodoma",6600000,"Tanzanya Şilini","svahili ","+255",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.tunus,"Tunus","Tunus",1200000,"Tunus Dinarı","Arapça","+216",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.ukrayna,"Ukrayna","Kiev",3700000,"Ukrayna Grivnası","Ukraynaca","+380",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.yunanistan,"Yunanistan","Atina",1000000,"Avro","yunanca","+30",getString(R.string.tr_aciklama)));


        UlkelerAdapter adapter =new UlkelerAdapter(ulkeler,this);
        lvUlkeler.setAdapter(adapter);


    }
}