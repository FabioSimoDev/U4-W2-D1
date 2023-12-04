package es1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }

        System.out.println("Array originale:");
        stampaArray(array);

        while (true) {
            System.out.println("Inserisci un numero (0 per terminare):");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            System.out.println("Inserisci l'indice dove inserire il numero:");
            int indice = scanner.nextInt();

            try {
                array[indice] = numero;
                stampaArray(array);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice non valido");
            }
        }

        scanner.close();
    }

    private static void stampaArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}