package Kosullu_Ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        int km, age;
        int travelType;
        double perKm = 0.10;

        double standardPrice;                // normal fiyatı
        double totalPrice;                  // toplam fiyatı
        double ageDiscount;                // Yaş İndirimi
        double ageDiscountRate;           // Yaş İndirim Oranı

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz ( 1 => Tek Yön, 2 => Gidiş Dönüş ): ");
        travelType = input.nextInt();

        if (!(km > 0 && age > 0 && (travelType == 1 || travelType == 2))) {
            System.out.println("Hatalı Veri Girdiniz! ");
        } else {

            if (age < 12) {
                ageDiscountRate = 0.50;
            } else if (age <= 24) {
                ageDiscountRate = 0.10;
            } else if (age > 65) {
                ageDiscountRate = 0.30;
            } else {
                ageDiscountRate = 0; // indirim uygulanmaz;
            }

            standardPrice = km * perKm;
            ageDiscount = standardPrice * ageDiscountRate;
            totalPrice = standardPrice - ageDiscount;
            if (travelType == 2) {   // Gidiş Dönüş Bilet İndirimi
                totalPrice = (totalPrice - (totalPrice * 0.20)) * 2;
            }
            System.out.println("Toplam Tutar = " + totalPrice);


        }


    }
}
