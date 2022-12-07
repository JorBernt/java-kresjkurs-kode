package skole.algdat.eksamen21;

public class Oppgave1 {

    public static void main(String[] args) {
        //Definer følgende heltalls-array : 20, 34,-4,4,5,11,-23.
        int[] tall = {20, 534, -4, 4, 5, 11, -23};

        // Lag et Java-program som ved hjelp av en
        //løkke for hver av deloppgavene:
        //1. Skriver ut tabellen med mellomrom mellom tallene
        for (int n : tall) {
            System.out.print(n + " ");
        }
        for (int i = 0; i < tall.length; i++) {
            System.out.print(tall[i]);
            if (i < tall.length - 1) {
                System.out.print(" ");
            }
        }
        //2. Skriver ut tabellen baklengs med mellomrom mellom tallene
        for (int i = tall.length - 1; i >= 0; i--) {
            System.out.print(tall[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        //3. Summerer tabellen
        int sum = 0;
        for(int n : tall) {
            sum += n;
        }
        System.out.println(sum);
        //4. Finner gjennomsnittet av tallene i tabellen
        int sum2 = 0;
        for(int n : tall) {
            sum2 += n;
        }
        double gjennomsnitt = (double) sum2 / tall.length;
        System.out.println(gjennomsnitt);
        //5. Skriver ut tallene som er mellom 0 og 20 (ikke inkludert tallene)
        for(int n : tall) {
            if(n > 0 && n < 20) {
                System.out.println(n);
            }
        }

    }
}
