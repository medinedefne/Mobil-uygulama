package com.example.uygulama1;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewresim;

    RadioButton radioButtongs,radioButtonfb,radioButtonbjk,radioButtonts;

    Button buttonsec;

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

        imageViewresim=findViewById(R.id.imageView_resim);
        radioButtongs=findViewById(R.id.radioButton_gs);
        radioButtonfb=findViewById(R.id.radioButton_fb);
        radioButtonbjk=findViewById(R.id.radioButton_bjk);
        radioButtonts=findViewById(R.id.radioButton_ts);
        buttonsec=findViewById(R.id.button_sec);

        buttonsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButtongs.isChecked()){
                    imageViewresim.setImageResource(R.drawable.gslogo);
                }
                else if (radioButtonfb.isChecked()) {
                    imageViewresim.setImageResource(R.drawable.fblogo);
                }
                else if (radioButtonbjk.isChecked()) {
                    imageViewresim.setImageResource(R.drawable.bjklogo);
                }
                else {
                    imageViewresim.setImageResource(R.drawable.tslogo);
                }
            }
        });
    }
}