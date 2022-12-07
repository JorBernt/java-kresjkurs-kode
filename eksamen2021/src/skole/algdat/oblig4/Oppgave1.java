package skole.algdat.oblig4;

public class Oppgave1 {
    public static void main(String[] args) {
        /*
        Gitt følgende int [] liste =  {2,4,6,12,78,45,3,42,5,-7};
        Skriv kode for å summere tallene med en for-løkke.
        Gjør det samme med en for each -løkke (utvidet for-løkke).
        Summene skal skrives ut i System.out på to forskjellige linjer.
         */
        int[] liste =  {2,4,6,12,78,45,3,42,5,-7};
        int sum = 0;
        for(int i = 0; i < liste.length; i++) {
            sum += liste[i];
        }
        System.out.println(sum);
        sum = 0;
        for(int n : liste) {
            sum += n;
        }
        System.out.println(sum);
    }
}
