package com.sercan;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        /**
         * Bir öğrencinin sınav notlarını (vize ve final) kullanıcıdan alın,
         * vize %40, final %60 etkili olacak şekilde ortalamayı hesaplayın.
         *
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz : ");
        short vizeNotu= scanner.nextShort();
        System.out.print("Final notunuzu giriniz : ");
        short finalNotu=scanner.nextShort();
        short ort= (short) ((vizeNotu*40/100)+(finalNotu*60/100));
        System.out.println("Not ortalamanız : "+ort);

    }
}
