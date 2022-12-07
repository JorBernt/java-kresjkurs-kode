package skole.algdat.atten;

//Lag en klasse kalt Liste for å behandle arrays.
class Liste {
    //1)  Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null
    public static int antallElementerOverNull(int[] tall) {
        int antall = 0;
        for (int n : tall) {
            if (n > 0)
                antall++;
        }
        return antall;
    }

    //2)  Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet skal også
    //inn i metoden)
    public static int antallForekomster(int[] tall, int tallet) {
        int antall = 0;
        for (int n : tall) {
            if (n == tallet) {
                antall++;
            }
        }
        return antall;
    }

    //3) Tar et heltallsarray inn og finner det største tallet i arrayet
    public int størsteTall(int[] tall) {
        int maks = tall[0];
        for (int n : tall) {
            if (n > maks) {
                maks = n;
            }
        }
        return maks;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        //Lag følgende statiske metoder i denne klassen som behandler arrays:
        int[] tall = {2, 4, -4, 55, -12, 68, -10, 59, 74, 0, -25, 4};
        System.out.println("Over null: " + Liste.antallElementerOverNull(tall));
        System.out.println("Antall forekomster av 4: " + Liste.antallForekomster(tall, 4));
        Liste liste = new Liste();
        System.out.println("Største tall: " + liste.størsteTall(tall));

        //Til slutt skriv kode i main-metoden for å kalle de ulike metodene med et heltallsarray
        //Resultatet skal skrives ut på System.out.
    }


}
