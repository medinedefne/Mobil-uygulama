package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView tvsonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


        tvsonuc=findViewById(R.id.textView_sonuc);

        Intent intent=getIntent();
        String ad=intent.getStringExtra("ad");
        String soyad=intent.getStringExtra("soyad");
        int dogumyil=intent.getIntExtra("yil",0);

        int yas=2025-dogumyil;

        tvsonuc.setText("Hoşgeldiniz "+ad+" "+soyad+"\n yaşınız:"+yas);

    }
}