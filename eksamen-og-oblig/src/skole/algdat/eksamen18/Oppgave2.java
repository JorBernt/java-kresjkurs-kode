package skole.algdat.eksamen18;

public class Oppgave2 {
    public static void main(String[] args) {
        //Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
        int[] tall = {-3, 41, 5, -3, 2, 49};
        //a)  Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
        int antall = 0;
        for (int n : tall) {
            if (n > 10)
                antall++;
        }
        System.out.println(antall);
        //b)  Skriv ut annethvert element
        for (int i = 0; i < tall.length; i += 2) {
            //Visst i er delelig på 2, så printer vi ut.
            System.out.println(tall[i]);
        }
        //c)  Skriv ut summen av alle positive tall i arrayet
        //d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
        int sum = 0;
        int antall2 = 0;
        for (int n : tall) {
            if (n > 0) {
                sum += n;
                antall2++;
            }
        }
        System.out.println(sum);
        System.out.println((double) sum / antall2);
    }
}
