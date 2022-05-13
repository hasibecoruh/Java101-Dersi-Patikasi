package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double aci,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        System.out.print("Daire Dilimin Açısını Giriniz (Derece): ");
        aci=input.nextDouble();

        alan = (pi*(r*r)*aci)/360;
        System.out.println("Daire Diliminin Alanı: "+alan);

    }
}
