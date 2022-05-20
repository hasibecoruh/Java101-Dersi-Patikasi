package Kosullu_Ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class SayilariSirala {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Sırasıyla 3 sayı giriniz.");
        System.out.print("1. sayı: ");
        a = input.nextInt();

        System.out.print("2. sayı: ");
        b = input.nextInt();

        System.out.print("3. sayı: ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {  // a en büyük değer ise
            if (b > c) {
                System.out.println(a + " > " + b + " >" + c);
            } else {
                System.out.println(a + " > " + c + " >" + b);
            }
        } else if ((b > a) && (b > c)) { // b en büyük değer ise
            if (a > c) {
                System.out.println(b + " > " + a + " >" + c);
            } else {
                System.out.println(b + " > " + c + " >" + a);
            }
        }
        else{ // c en büyük ise. Son durum.
            if (a > b) {
                System.out.println(c + " > " + a + " >" + b);
            } else {
                System.out.println(c + " > " + b + " >" + a);
            }
        }

    }
}
