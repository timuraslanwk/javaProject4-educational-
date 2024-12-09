package src.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan dizi elemanlarını aldık.

        System.out.print("1.Dizinin elemanlarını giriniz(virgülle ayrılmış)= ");
        String array1 = scanner.nextLine();
        System.out.print("2.Dizinin elemanlarını giriniz(virgülle ayrılmış)= ");
        String array2 = scanner.nextLine();

        String[] arrayDizi = array1.split(",");
        String[] array2Dizi = array2.split(",");

        int[] array1Int = new int[arrayDizi.length];
        int[] array2Int = new int[array2Dizi.length];

        for (int i = 0; i < arrayDizi.length; i++) {
            array1Int[i] = Integer.parseInt(arrayDizi[i]);
        }

        for (int i = 0; i < array2Dizi.length; i++) {
            array2Int[i] = Integer.parseInt(array2Dizi[i]);
        }

        int[] mergedArray = new int[array1Int.length + array2Int.length];

        int sayac = 0;

        for (int i = 0; i < array1Int.length; i++) {
            mergedArray[sayac] = array1Int[i];
            sayac++;
        }

        for (int i = 0; i < array2Int.length; i++) {
            mergedArray[sayac] = array2Int[i];
            sayac++;
        }

        Arrays.sort(mergedArray);
        System.out.print("Birleştirilmiş dizi= ");

        for (int i = 0; i < mergedArray.length; i++) {

            if (i != mergedArray.length-1) {

                if (mergedArray[i] != mergedArray[i+1]) {
                    System.out.print(mergedArray[i] + " ");
                }

            } else System.out.print(mergedArray[i]);


        }


    }
}