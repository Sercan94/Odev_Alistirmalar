package com.sercan;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir ürünün fiyatını alın ve
         * %18 KDV eklenmiş halini ekrana yazdıran bir program yazın.
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen ürünün fiyatını giriniz : ");
        float fiyat=sc.nextFloat();
        float fiyatKDVli=(fiyat*18/100)+fiyat;
        System.out.print("Ürünün KDV'li fiyatı : "+fiyatKDVli+" tl");
    }
}
