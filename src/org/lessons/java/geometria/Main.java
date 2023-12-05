package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Richiesta all'utente di inserire la base e l'altezza
        System.out.print("Inserisci la base del rettangolo: ");
        int base = scanner.nextInt();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        int altezza = scanner.nextInt();

        // Creazione di un nuovo rettangolo
        Rettangolo rettangolo = new Rettangolo(base, altezza);

        // Calcolo e stampa dell'area e del perimetro
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());

        // Disegno del rettangolo in console
        System.out.println("Rettangolo disegnato:");
        rettangolo.disegna();

        scanner.close();
    }
}