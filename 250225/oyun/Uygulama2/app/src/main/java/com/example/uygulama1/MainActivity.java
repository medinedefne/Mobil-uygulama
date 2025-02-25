package com.example.uygulama1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Oyuncu oyuncu1;
    Oyuncu oyuncu2;
    Button buttonTank1;
    Button buttonTank2;
    Button buttonTopcu1;
    Button buttonTopcu2;
    Button buttonReset;
    ProgressBar progressBar1;
    ProgressBar progressBar2;
    TextView textViewPuan;
    Integer isabet;
    ArrayList<Oyuncu> oyuncular = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        oyuncu1 = new Oyuncu("Oyuncu 1",100);
        oyuncu2 = new Oyuncu("Oyuncu 2",100);
        oyuncular.add(oyuncu1);
        oyuncular.add(oyuncu2);
        buttonTank1 = findViewById(R.id.btnTankci1);
        buttonTank2 = findViewById(R.id.btnTankci2);
        buttonTopcu1 = findViewById(R.id.btntopcu1);
        buttonTopcu2 = findViewById(R.id.btntopcu2);
        buttonReset = findViewById(R.id.btnBastanBasla);
        progressBar1 = findViewById(R.id.progressBar3);
        progressBar2 = findViewById(R.id.progressBar2);
        textViewPuan = findViewById(R.id.tvPuan);
        buttonTank1.setOnClickListener(view -> {
            isabet = oyuncu1.tankci.atesEt(oyuncu2);
            progressBar2.setProgress(oyuncu2.getCan());
            textViewPuan.setText(isabet.toString());
            oyuncuKontrolet();
        });
        buttonTopcu1.setOnClickListener(view -> {
            isabet = oyuncu1.topcu.atesEt(oyuncu2);
            progressBar2.setProgress(oyuncu2.getCan());
            textViewPuan.setText(isabet.toString());
            oyuncuKontrolet();
        });
        buttonTank2.setOnClickListener(view -> {
            isabet = oyuncu2.tankci.atesEt(oyuncu1);
            progressBar1.setProgress(oyuncu1.getCan());
            textViewPuan.setText(isabet.toString());
            oyuncuKontrolet();
        });
        buttonTopcu2.setOnClickListener(view -> {
            isabet = oyuncu2.topcu.atesEt(oyuncu1);
            progressBar1.setProgress(oyuncu1.getCan());
            textViewPuan.setText(isabet.toString());
            oyuncuKontrolet();
        });
        buttonReset.setOnClickListener(view -> {
            oyuncu1.setCan(100);
            oyuncu2.setCan(100);
            progressBar1.setProgress(oyuncu1.getCan());
            progressBar2.setProgress(oyuncu2.getCan());
            textViewPuan.setText("0");
        });
    }
    private void oyuncuKontrolet() {
        for (Oyuncu oyuncu:oyuncular) {
            if (oyuncu.getCan()<=0 )
                textViewPuan.setText("Oyun Bitti");
        }
    }
}