package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class notOrtalamasiHesaplama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;


        Scanner input = new Scanner(System.in);


        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;


        System.out.println("Ortalamanız : "+ ortalama);


        boolean gectiMi = ortalama >= 60;
        String str = gectiMi ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);

    }
}
