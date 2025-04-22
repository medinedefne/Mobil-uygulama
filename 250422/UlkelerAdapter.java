package com.example.uygulama1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UlkelerAdapter extends BaseAdapter {

    ArrayList<Ulke> liste;
    Context context;
    public UlkelerAdapter(ArrayList<Ulke>liste,Context context){
        this.liste=liste;
        this.context=context;
    }

    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Object getItem(int i) {
        return liste.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imagebayrak;
        TextView tvad,tvBaskent,tvNufus;

        Ulke ulke=liste.get(i);
        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.listview_satir,viewGroup,false);
        }
        imagebayrak=view.findViewById(R.id.image_bayrak);
        tvad=view.findViewById(R.id.tv_ad);
        tvBaskent=view.findViewById(R.id.tv_baskent);
        tvNufus=view.findViewById(R.id.tv_nufus);

        tvad.setText(ulke.getAd());
        tvBaskent.setText(ulke.getBaskent());
        tvNufus.setText("Nüfus:"+String.valueOf(ulke.getNufus()));
        imagebayrak.setImageResource(ulke.getBayrak());


        return view;
    }
}
