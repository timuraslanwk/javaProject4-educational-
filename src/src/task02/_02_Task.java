package src.task02;

import java.util.Scanner;

public class _02_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Parolanızı giriniz= ");
        String parola = scanner.nextLine();

        parolayiOku(parola);


    }

    public static void parolayiOku(String a) {

        boolean uzunlukYeterliMi = false;
        boolean buyukHarfVarMi = false;
        boolean kucukHarfVarMi = false;
        boolean ozelKarakterVarMi = false;


        for (int i = 0; i < a.length(); i++) {
            char k = a.charAt(i);

            if (a.length() >= 8) {
                uzunlukYeterliMi = true;
            }

            if (Character.isUpperCase(a.charAt(i))) {
                buyukHarfVarMi = true;
            }

            if (Character.isLowerCase(a.charAt(i))) {
                kucukHarfVarMi = true;
            }

            ozelKarakterVarMi=ozelKarakterler(k);

        }


        if (uzunlukYeterliMi && buyukHarfVarMi && kucukHarfVarMi && ozelKarakterVarMi) {
            System.out.println("Parolanız güçlü.");
        } else System.out.println("Parolanız zayıf.");


    }

    public static boolean ozelKarakterler(char a) {

        char[] ozelSemboller = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '-', '=', '{', '}', '[', ']', ';', ':', '\'', ',', '<', '.', '>', '/', '?'};

        boolean ozelKarakterVarMi = false;

        for (int i = 0; i < ozelSemboller.length; i++) {
            if (a == ozelSemboller[i]) {
                ozelKarakterVarMi = true;
                break;
            }
        }

        return ozelKarakterVarMi;


    }
}
