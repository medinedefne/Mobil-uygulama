package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextsayi1,editTextsayi2;
    RadioButton radioButtonTopla,radioButtonCıkar,radioButtonCarp,radioButtonBol;
    Button buttonHesapla;
    TextView textViewSonuc;

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
        editTextsayi1=findViewById(R.id.editTextNumber_sayi1);
        editTextsayi2=findViewById(R.id.editTextNumber_sayi2);
        radioButtonTopla=findViewById(R.id.radioButton_topla);
        radioButtonCıkar=findViewById(R.id.radioButton2_cikar);
        radioButtonCarp=findViewById(R.id.radioButton3_carp);
        radioButtonBol=findViewById(R.id.radioButton4_bol);
        buttonHesapla=findViewById(R.id.button_hesapla);
        textViewSonuc=findViewById(R.id.textView_sonuc);

        buttonHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sayi1=Double.parseDouble(editTextsayi1.getText().toString());
                double sayi2=Double.parseDouble(editTextsayi2.getText().toString());
                double sonuc=0;

                if(radioButtonTopla.isChecked()){
                    sonuc=sayi1+sayi2;
                }
                else if (radioButtonCıkar.isChecked()) {
                    sonuc=sayi1-sayi2;
                }
                else if (radioButtonCarp.isChecked()) {
                    sonuc=sayi1*sayi2;
                }
                else {
                    sonuc=sayi1/sayi2;
                }
                textViewSonuc.setText("sonuc:"+sonuc);
            }
        });
    }
}