package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {

        double boy, kilo;
        double vki;  // vücut kitle indeksi

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}
