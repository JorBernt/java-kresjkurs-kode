package skole.algdat.eksamen18;

public class Oppgave1 {
    public static void main(String[] args) {
        //Skriv kode for å skrive ut alle tallene fra 1 til 25 (begge inkludert) på hver sin linje. Bruk
        //System.out.println()
        //a)  Bruk en while-løkke for å få utskriften.
        int n = 1;
        while (n <= 25) {
            System.out.println(n);
            n++;
        }
        //b)  Bruk en for-løkke for å få utskriften.
        for(int i = 1; i <= 25; i++) {
            System.out.println(i);
        }
    }
}
