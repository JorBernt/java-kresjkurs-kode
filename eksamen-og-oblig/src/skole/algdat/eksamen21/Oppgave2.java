package skole.algdat.eksamen21;

import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args) {
        //Det skal lages et program som regner ut BMI (Body Mass Index). Det skal brukes input-
        //dialogbokser og meldingsboks fra Swing-bibliotektet.

        //Først skal det leses inn vekten (i kg)
        String vektInn = JOptionPane.showInputDialog("Hva er vekten din i kg?");

        //Konverter til double og feilsjekker input'en
        double vekt = 0;
        try {
            vekt = Double.parseDouble(vektInn);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Du må skrive inn et korrekt tall");
            return;
        }

        // og deretter høyden (i cm).
        String hoydeInn = JOptionPane.showInputDialog("Hva er høyden din i cm");
        //Konverter til integer og feilsjekker input'en
        int hoyde = 0;
        try {
            hoyde = Integer.parseInt(hoydeInn);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Du må skrive inn et korrekt tall");
            return;
        }

        //Så skal BMI'en regnes ut med følgende formel:
        //( 1,3 * vekt) / ( høyde/100)^ 2,5 )
        //^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntalllet og b eksponenten.
        double bmi = (1.3 * vekt) / Math.pow((double)hoyde/100, 2.5);

        //Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.
        JOptionPane.showMessageDialog(null, "Din BMI er " + String.format("%.2f", bmi));

        /*

        Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen
        isteden for beregningen.

                Skriv ditt svar her
                */
    }
}
