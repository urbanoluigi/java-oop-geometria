package org.lessons.java.geometria;

public class Rettangolo {
    private int base;
    private int altezza;

    // Costruttore con parametri
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo per calcolare l'area
    public int calcolaArea() {
        return base * altezza;
    }

    // Metodo per calcolare il perimetro
    public int calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    // Bonus: Metodo per disegnare il rettangolo in console
    public void disegna() {
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altezza - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // spazio per l'interno
                }
            }
            System.out.println();
        }
    }
}
