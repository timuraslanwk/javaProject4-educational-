package src.task04;

import java.util.ArrayList;

public class _04_Task {
    public static void main(String[] args) {

        int sayi;

        sayi = (int) (Math.random() * (10 - 7) + 7);

        int[] parolaSayi= new int[sayi];

        for (int i = 0; i <= sayi; i++) {
            if (i!=sayi) {
                parolaSayi[i] = (int) (Math.random() * (126 - 33) + 33);
            } else parolaSayi[i-1]= (int) (Math.random() * (126 - 33) + 33);
        }

        char[] charDizi= new char[sayi];


        System.out.print("Oluşturulan parola= ");

        for (int i = 0; i < parolaSayi.length; i++) {
            System.out.print(charDizi[i] = (char) (parolaSayi[i]));
        }














    }

}
