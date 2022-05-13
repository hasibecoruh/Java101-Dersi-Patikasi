package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class DikUcgenAlani {
    public static void main(String[] args) {
        double a,b,c;
        double u;
        double alan;
        
        Scanner girdi = new Scanner(System.in);

        System.out.println("Üçgenin Kenar Uzunluklarını Giriniz: ");
        System.out.println("------------------------------------");
        System.out.print("1.Kenar: ");
        a = girdi.nextDouble();
        System.out.print("2.Kenar: ");
        b = girdi.nextDouble();
        System.out.print("3.Kenar: ");
        c = girdi.nextDouble();
        System.out.println("------------------------------------");

        u = (a+b+c) / 2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: "+ alan);

    }
}


