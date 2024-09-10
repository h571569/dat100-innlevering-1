package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O1 {
        public static void main(String[] args) {

            double trinn1 = 1.7;
            double trinn2 = 4.0;
            double trinn3 = 13.6;
            double trinn4 = 16.6;
            double trinn5 = 17.6;

            int input = parseInt(showInputDialog("Hvor mange lønn skal du skrive"));
            int i = 0;
            do {
                double lønn = parseInt(showInputDialog("Skriv inn lønn"));
                i++;

                if (lønn > 1350001) {
                    //Lønn over 1.350.001kr
                    double skatt = (lønn * trinn5) / 100;
                    showMessageDialog(null, "Du har trinnskatt 5 og må betale " + skatt);
                } else if (lønn >= 937901) {
                    //lønn fra 937.901-1.350.000kr
                    double skatt = (lønn * trinn4) / 100;
                    showMessageDialog(null, "Du har trinnskatt 4 og må betale " + skatt);
                } else if (lønn >= 670001) {
                    //Lønn fra 670.001-937.900kr
                    double skatt = (lønn * trinn3) / 100;
                    showMessageDialog(null, "Du har trinnskatt 3 og må betale " + skatt);
                } else if (lønn >= 292851) {
                    //Lønn fra 292.851-670.000kr
                    double skatt = (lønn * trinn2) / 100;
                    showMessageDialog(null, "Du har trinnskatt 2 og må betale " + skatt);
                } else if (lønn >= 208051) {
                    //lønn fra 208.051 - 292.850kr
                    double skatt = (lønn * trinn1) / 100;
                    showMessageDialog(null, "Du har trinnskatt 1 og må betale " + skatt);
                } else if (lønn >= 0) {
                    //lønn fra 0 - 208.292050kr
                    showMessageDialog(null, "Du har ikke trinnskatt");
                } else {
                    //Alt som er negativt
                    showMessageDialog(null, "Ugyldig lønn");
                    i--;
                }
            } while (i < input);
        }
}