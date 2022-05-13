package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20;
        int startPrice = 10;
        int minimumTotal = 20;
        double total;


        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        total = startPrice + (km*perKm);

        total = (total < minimumTotal) ? minimumTotal : total;

        System.out.println("----------------------------");
        System.out.println("Toplam Tutar "+ total);



    }
}
