package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class Kdv_Tutari_Hesaplama {
    public static void main(String[] args) {
        double tutar,kdvTutar, kdvliTutar, kdv_orani;
        boolean girilenTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        girilenTutar = tutar > 1000;
        kdv_orani = girilenTutar ? 0.08 : 0.18;

        kdvTutar = tutar * kdv_orani;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("-----------------------------------");
        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV Oranı:" + kdv_orani);
        System.out.println("KDV Tutarı:" +kdvTutar);
        System.out.println("KDV'li Tutar: "+ kdvliTutar);

    }
}
