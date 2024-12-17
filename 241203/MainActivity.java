package com.example.ornek1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnTikla;

    EditText etad;

    TextView tvmesaj;


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
        btnTikla=findViewById(R.id.button_tikla);
        etad=findViewById(R.id.editText_ad);
        tvmesaj=findViewById(R.id.textView_mesaj);

        btnTikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ad=etad.getText().toString();
                //Toast.makeText(MainActivity.this, "Hoşgeldin " +ad, Toast.LENGTH_SHORT).show();

                tvmesaj.setText("Hoşgeldin "+ad);

                Mesajver(ad);

            }

            private void Mesajver(String ad) {
                Toast.makeText(MainActivity.this, "Hoşgeldin "+ad, Toast.LENGTH_SHORT).show();
            }
        });
    }
}