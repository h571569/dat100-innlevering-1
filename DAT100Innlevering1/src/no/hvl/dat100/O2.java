package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {
    public static void main(String[] args) {

        int input = parseInt(showInputDialog("Hvor mange karakterer skal ha"));
        int i = 0;
        do {
            i++;
            int karakter = parseInt(showInputDialog("Karaktersum"));
            if (karakter >= 90 && karakter <= 100) {
                showMessageDialog(null, "A");
            } else if (karakter >= 80 && karakter <= 89) {
                showMessageDialog(null, "B");
            } else if (karakter >= 60 && karakter <= 79) {
                showMessageDialog(null, "C");
            } else if (karakter >= 50 && karakter <= 59) {
                showMessageDialog(null, "D");
            } else if (karakter >= 40 && karakter <= 49) {
                showMessageDialog(null, "E");
            } else if (karakter >= 0 && karakter <= 39) {
                showMessageDialog(null, "F");
            }
            if (karakter > 100 || karakter < 0) {
                i--;
                showMessageDialog(null, "Feil input, tall må være mellom 0-100");
            }
        } while (i < input);

    }
}
