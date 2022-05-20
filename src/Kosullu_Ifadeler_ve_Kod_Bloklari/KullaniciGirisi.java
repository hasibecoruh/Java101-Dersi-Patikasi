package Kosullu_Ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password;


        Scanner input = new Scanner(System.in);


        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız! ");
        }else if(userName.equals("patika")){ // Kullanıcı adı doğru şifre yanlış.
            int select;
            String newPassword;
            System.out.println("Şifre Yanlış. Sıfırlansın mı?");
            System.out.print("1-Evet\n2-Hayır\n");
            select = input.nextInt();
            input.nextLine();
            switch (select){
                case 1:
                    System.out.print("Yeni şifre giriniz:");
                    newPassword = input.nextLine();

                    if(newPassword.equals(password) || newPassword.equals("java123")){
                        System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                    }else {
                        System.out.println("Şifre Oluşturuldu");
                        System.out.println("Yeni şifreniz: "+newPassword);
                    }

                    break;
                case 2:
                    System.out.println("Şifre Sıfırlanmadı");
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
            }
        }
        else {
            System.out.println("Bilgileriniz Yanlış!");
        }

    }
}

