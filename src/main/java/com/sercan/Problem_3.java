package com.sercan;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan yarıçapı alınan bir dairenin alanını ve çevresini hesaplayan bir program yazın
         * (alan = π * r^2, çevre = 2 * π * r).
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz : ");
        int yaricap=sc.nextInt();
        float alan= (float) (yaricap*yaricap*3.14);
        float  cevre= (float) (2*3.14*yaricap);
//        float alan= (float) (yaricap*yaricap*Math.PI);
//        float cevre= (float) (2*Math.PI*yaricap);
        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin çevresi : "+cevre);



    }
}
