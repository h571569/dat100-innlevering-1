package no.hvl.dat100;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class O3 {

    public static void main (String[] args) {

        boolean positiv = false;
        int k = 1;
        int heltall;

        System.out.println("Skriv inn ett heltall ");

        do {
            //Do-While loop for å få inn ett positivt heltall
            Scanner inn = new Scanner(System.in);
            heltall = parseInt(inn.nextLine());

            if (heltall<0) {
                System.out.println("Heltall kan ikke være mindre enn 0");
            } else {
                positiv = true;
            }

        } while (!positiv);



        for (int i = 1; i<=heltall; i++) {
            k *= i;
        }
        System.out.println(k);

    }
}
