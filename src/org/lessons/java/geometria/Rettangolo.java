package org.lessons.java.geometria;

public class Rettangolo {
    int base;
    int altezza;

    // Costruttore con parametri
    Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo per calcolare l'area
    int calcolaArea() {
        return base * altezza;
    }

    // Metodo per calcolare il perimetro
    int calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    // Bonus: Metodo per disegnare il rettangolo in
    void disegna() {
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
