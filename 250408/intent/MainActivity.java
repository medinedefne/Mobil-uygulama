package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etAd,etSoyad,etYil;

    private Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etAd=findViewById(R.id.editText_Ad);
        etSoyad=findViewById(R.id.editText_Soyad);
        etYil=findViewById(R.id.editText_Dogumyil);
        btnGonder=findViewById(R.id.button_Gonder);

        Intent intent=new Intent(this,MainActivity2.class);

        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("ad",etAd.getText().toString());
                intent.putExtra("soyad",etSoyad.getText().toString());
                intent.putExtra("yil",Integer.parseInt(etYil.getText().toString()));

                startActivity(intent);
            }


        });

    }
}