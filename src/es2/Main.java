package es2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km percorsi: ");
            double km = scanner.nextDouble();

            System.out.println("Inserisci i litri di carburante consumati: ");
            double litri = scanner.nextDouble();

            if (litri == 0) {
                throw new ArithmeticException("Il numero di litri non può essere zero.");
            }

            double kmPerLitro = km / litri;
            System.out.println("I km/litro percorsi sono: " + kmPerLitro);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
