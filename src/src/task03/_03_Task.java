package src.task03;

import java.util.Scanner;

public class _03_Task {
    public static void main(String[] args) {

        while (islemeDevamMi()) {
            System.out.println("Aylık Fatura= " + faturaHesapla() + " ₺");
        }
    }

    public static float faturaHesapla() {

        Scanner scanner = new Scanner(System.in);

        float aylikFatura = 0, aylikSabitUcret, ekstraUcret, ekUcretBirimFiyati;
        int kategori, fazlaKullanimMiktari;

        System.out.print("Aylık sabit ücreti giriniz= ");
        aylikSabitUcret = scanner.nextFloat();
        System.out.print("Kullanıcının kategorisini (1, 2 veya 3) giriniz= ");
        kategori = scanner.nextInt();
        System.out.print("Fazla kullanım miktarını (GB) giriniz= ");
        fazlaKullanimMiktari = scanner.nextInt();

        switch (kategori) {

            case 1:
                ekUcretBirimFiyati = 0.10F;
                ekstraUcret = ekUcretBirimFiyati * fazlaKullanimMiktari;
                aylikFatura = aylikSabitUcret + ekstraUcret;
                break;

            case 2:
                ekUcretBirimFiyati = 0.20F;
                ekstraUcret = ekUcretBirimFiyati * fazlaKullanimMiktari;
                aylikFatura = aylikSabitUcret + ekstraUcret;
                break;

            case 3:
                ekUcretBirimFiyati = 0.30F;
                ekstraUcret = ekUcretBirimFiyati * fazlaKullanimMiktari;
                aylikFatura = aylikSabitUcret + ekstraUcret;
                break;

            default:
                System.out.println("Lütfen geçerli birimi giriniz. Fatura hesaplanamadı.");
        }


        return aylikFatura;
    }

    public static boolean islemeDevamMi() {
        boolean islemeDevamMi = false;


        Scanner scannerStr = new Scanner(System.in);
        System.out.print("Yeni bir müşteri için hesaplama yapmak ister misiniz? (Evet için'E', Hayır için 'H')= ");
        String cevap = scannerStr.nextLine().trim();

        if (cevap.equalsIgnoreCase("e") || cevap.equalsIgnoreCase("y")
                || cevap.equalsIgnoreCase("yes") || cevap.equalsIgnoreCase("evet")) {
            islemeDevamMi = true;

        } else if (cevap.equalsIgnoreCase("h") || cevap.equalsIgnoreCase("n")
                || cevap.equalsIgnoreCase("no") || cevap.equalsIgnoreCase("hayır")) {

            System.out.println("Program sonlandırıldı. ");

        } else {
            islemeDevamMi = false;
            System.out.println("Lütfen geçerli bir tuşlama yapınız.");

        }
        return islemeDevamMi;


    }

}
