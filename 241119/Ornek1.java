package com.example.uygulama1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        double ortalama1,ortalama2;
        System.out.print("ortalama 1:");
        ortalama1= oku.nextDouble();
        System.out.print("ortalama 2:");
        ortalama2= oku.nextDouble();

        double ortalama=ortalama(ortalama1,ortalama2);

        System.out.println("ortalama: "+ortalama);


    }

    private static double ortalama(double ortalama1, double ortalama2) {
        double sonuc=(ortalama1+ortalama2)/2;
        return sonuc;

    }
}



