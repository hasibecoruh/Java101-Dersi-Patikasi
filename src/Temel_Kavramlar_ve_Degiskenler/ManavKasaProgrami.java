package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.0;

        double armutKilo;
        double elmaKilo;
        double domatesKilo;
        double muzKilo;
        double patlicanKilo;

        double toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? :");
        armutKilo = input.nextDouble();
        System.out.print("Elma Kaç Kilo? :");
        elmaKilo = input.nextDouble();
        System.out.print("Domates Kaç Kilo? :");
        domatesKilo = input.nextDouble();
        System.out.print("Muz Kaç Kilo? :");
        muzKilo = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? :");
        patlicanKilo = input.nextDouble();

        toplamTutar = armutFiyat * armutKilo + elmaFiyat * elmaKilo +
                domatesFiyat * domatesKilo + muzFiyat * muzKilo +
                patlicanFiyat * patlicanKilo;

        System.out.println("Toplam Tutar: " + toplamTutar);


    }
}
