package Kosullu_Ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class ArtikYilHesaplama {


    public static void main(String[] args) {
        boolean isLeapYear = false;
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if (year < 0) {
            System.out.println("Yanlış yıl girdiniz.");
        }
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır");
        } else {
            System.out.println(year + " bir artık yıl değildir! ");
        }
    }


}
