package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Richiede all'utente di inserire i valori di base e altezza
        System.out.print("Inserisci la base del rettangolo: ");
        int base = scanner.nextInt();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        int altezza = scanner.nextInt();

        // Crea un nuovo rettangolo
        Rettangolo rettangolo = new Rettangolo(base, altezza);

        // Stampa a video l'area e il perimetro
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());

        // Bonus: Disegna il rettangolo in console
        System.out.println("Rettangolo disegnato:");
        rettangolo.disegna();

        scanner.close();
    }
}
