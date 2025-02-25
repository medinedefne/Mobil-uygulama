package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btncalistir,btnyavasla,btnhizlan,btndurdur;
    private TextView tvDurum;
    private Araba araba;
    String durum=""; //globel olarak tanımladık. Durum belgesinde kullanacagız.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        araba=new Araba("Toyota","corolla",220);
        durum="Durum;\n"+"Marka: "+araba.getMarka()+"\n"+"Model: "+araba.getModel()+"\n"+"Son Hız: "+araba.getSonHiz()+" km/h\n";

        btncalistir=findViewById(R.id.btn_calistir);
        btnyavasla=findViewById(R.id.btn_yavasla);
        btnhizlan=findViewById(R.id.btn_hizlan);
        btndurdur=findViewById(R.id.btn_durdur);
        tvDurum=findViewById(R.id.tv_durum);

        btncalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDurum.setText(durum+araba.calistir());

            }
        });

        btndurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDurum.setText(durum+araba.durdur());

            }
        });

        btnhizlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                araba.hizlan(20); //parametre olarak verdiğimiz değer kadar artar
                tvDurum.setText(durum+"arabanın hızı: "+araba.getAnlikHiz()+"km/h ");


            }
        });

        btnyavasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                araba.yavasla(10);
                tvDurum.setText(durum+"arabanın hızı: "+araba.getAnlikHiz()+"km/h ");

            }
        });

    }
}