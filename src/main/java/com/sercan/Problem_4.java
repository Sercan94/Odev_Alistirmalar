package com.sercan;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir cümle alın ve cümlenin karakter sayısını ekrana yazdıran bir program yazın.
         *
         */
        System.out.println("Lütfen bir cümle giriniz : ");
        String cümle=new Scanner(System.in).nextLine();
        System.out.print(cümle.length());
    }
}
