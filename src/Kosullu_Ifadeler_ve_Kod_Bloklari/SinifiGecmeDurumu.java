package Kosullu_Ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int counter = 5;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.println("Notlarınızı 0-100 aralığında giriniz.");
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();

        if (!(mat >= 0 && mat <= 100)) {
            mat = 0;  // Ortalamaya katılmasın
            counter--;
            System.out.println("Matematik notunuzu yanlış girdiniz!!" +
                    "Ortalamaya katılmadı");
        }
        if (!(turkce >= 0 && turkce <= 100)) {
            turkce = 0;  // Ortalamaya katılmasın
            counter--;
            System.out.println("Türkçe notunuzu yanlış girdiniz!!" +
                    "Ortalamaya katılmadı");
        }
        if (!(fizik >= 0 && fizik <= 100)) {
            fizik = 0;  // Ortalamaya katılmasın
            counter--;
            System.out.println("Fizik notunuzu yanlış girdiniz!!" +
                    "Ortalamaya katılmadı");
        }
        if (!(kimya >= 0 && kimya <= 100)) {
            kimya = 0;  // Ortalamaya katılmasın
            counter--;
            System.out.println("Kimya notunuzu yanlış girdiniz!!" +
                    "Ortalamaya katılmadı");
        }
        if (!(muzik >= 0 && muzik <= 100)) {
            muzik = 0;  // Ortalamaya katılmasın
            counter--;
            System.out.println("Müzik notunuzu yanlış girdiniz!!" +
                    "Ortalamaya katılmadı");
        }

        System.out.println("----------------------------------------------");
        if (counter == 0) {
            System.out.println("Notları Yanlış Girdiniz. Düzeltiniz.");
        } else {
            avarage = (mat + fizik + turkce + kimya + muzik) / counter;

            if (avarage <= 55) {

                System.out.println("Sınıfta kaldınız, seneye tekrar görüşçek üzere!");
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }
            System.out.println("Ortalamanız: " + avarage);
        }


    }
}
