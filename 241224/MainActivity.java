package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxcorba,checkBoxpilav,checkBoxsalata,checkBoxcigkofte,checkBoxprofiterol;

    EditText editTextcorbaadet,editTextpilavadet,editTextsalataadet,editTextcigkofteadet,editTextpradet;

    Button buttonsiparis;

    TextView textViewozet;



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

        checkBoxcorba=findViewById(R.id.checkBox_corba);
        checkBoxpilav=findViewById(R.id.checkBox_pilav);
        checkBoxsalata=findViewById(R.id.checkBox_salata);
        checkBoxcigkofte=findViewById(R.id.checkBox_cigkofte);
        checkBoxprofiterol=findViewById(R.id.checkBox_profiterol);
        editTextcorbaadet=findViewById(R.id.editTextNumber_corbaadet);
        editTextpilavadet=findViewById(R.id.editTextNumber_pilavadet);
        editTextsalataadet=findViewById(R.id.editTextNumber_salataadet);
        editTextcigkofteadet=findViewById(R.id.editTextNumber_cigkofteadet);
        editTextpradet=findViewById(R.id.editTextNumber_pradet);
        buttonsiparis=findViewById(R.id.button_siparis);
        textViewozet=findViewById(R.id.textView_ozet);

        buttonsiparis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float corbafiyat=50,pilavfiyat=100,salatafiyat=60,cigkoftefiyat=50,profiterolfiyat=55;
                float toplamfiyat=0,adet=0;
                String s="Sipariş Özet;\n------------\n";

                if (checkBoxcorba.isChecked()){
                    adet=Float.parseFloat(editTextcorbaadet.getText().toString());
                    toplamfiyat+=(corbafiyat*adet);
                    s+="Çorba\n";

                }

                if (checkBoxpilav.isChecked()){
                    adet=Float.parseFloat(editTextpilavadet.getText().toString());
                    toplamfiyat+=(pilavfiyat*adet);
                    s+="pilav\n";
                }
                if (checkBoxsalata.isChecked()){
                    adet=Float.parseFloat(editTextsalataadet.getText().toString());
                    toplamfiyat+=(salatafiyat*adet);
                    s+="salata\n";
                }
                if (checkBoxcigkofte.isChecked()){
                    adet=Float.parseFloat(editTextcigkofteadet.getText().toString());
                    toplamfiyat+=(cigkoftefiyat*adet);
                    s+="cigkofte\n";
                }
                if (checkBoxprofiterol.isChecked()){
                    adet=Float.parseFloat(editTextpradet.getText().toString());
                    toplamfiyat+=(profiterolfiyat*adet);
                    s+="profiterol\n";
                }

                textViewozet.setText(s+"------------\nToplam Tutar:"+toplamfiyat);

            }
        });

    }
}