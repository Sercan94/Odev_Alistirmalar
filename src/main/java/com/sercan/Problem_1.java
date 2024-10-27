package com.sercan;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        /**
         * Problem: Kullanıcıdan iki tamsayı alın ve
         * bu sayıların toplamını, farkını, çarpımını ve
         * bölümünü ekrana yazdıran bir program yazın.
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        int sayi1=sc.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int sayi2=sc.nextInt();
        int toplam=sayi1+sayi2; //İki sayinin toplamı
        System.out.println("İki sayinin toplamı : "+toplam);
        int fark=sayi1-sayi2;   //İki sayinin farki
        System.out.println("İki sayinin farkı : "+fark);
        int çarpım=sayi1*sayi2; //İki sayinin çarpımı
        System.out.println("İki sayinin çarpımı : "+çarpım);
        double bölüm=(double)sayi1/sayi2;   //iki sayinin bölümü
        System.out.println("İki sayinin bölümü : "+bölüm);



    }
}