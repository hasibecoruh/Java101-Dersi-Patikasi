package Kosullu_Ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dateBirth;
        String zodiacSign = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        dateBirth = input.nextInt();

        switch (dateBirth % 12) {
            case 0:
                zodiacSign = "Maymun";
                break;
            case 1:
                zodiacSign = "Horoz";
                break;
            case 2:
                zodiacSign = "Köpek";
                break;
            case 3:
                zodiacSign = "Domuz";
                break;
            case 4:
                zodiacSign = "Fare";
                break;
            case 5:
                zodiacSign = "Öküz";
                break;
            case 6:
                zodiacSign = "Kaplan";
                break;
            case 7:
                zodiacSign = "Tavşan";
                break;
            case 8:
                zodiacSign = "Ejderha";
                break;
            case 9:
                zodiacSign = "Yılan";
                break;
            case 10:
                zodiacSign = "At";
                break;
            case 11:
                zodiacSign = "Koyun";
                break;
            default:
                isError = true;
                break;
        }
        if (isError) {
            System.out.println("Geçersiz tarih girdiniz! ");
        } else {
            System.out.println("Çin Zodyağı Burcunuz : " + zodiacSign);
        }

    }
}
