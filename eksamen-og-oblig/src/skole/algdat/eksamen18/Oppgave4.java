package skole.algdat.eksamen18;

import java.util.ArrayList;
import java.util.List;

class Ansatt {
    // opprett 3 attributter
    // navn, født og tiltrådt, de to siste skal være av type Dato.
    private String navn;
    private Dato født, tiltrådt;

    // opprett også en konstruktør for disse

    public Ansatt(String navn, Dato født, Dato tiltrådt) {
        this.navn = navn;
        this.født = født;
        this.tiltrådt = tiltrådt;
    }


    // lag også en toString-metode for klassens attributter
    @Override
    public String toString() {
        return "Navn: " + navn + "\n" +
                "Født: " + født.toString() + "\n" +
                "Tiltrådt: " + tiltrådt.toString();
    }
}

class Dato {
    private int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd) {
        String[] navn = {"januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember"};
        if (mnd > 0 && mnd < 13)
            return navn[mnd - 1];
        else
            return "ukjent måned";
    }

    // skriv en toString metode slik at datoen kommer ut på følgende format:
    // dd månedsnavn år, f.eks 1 januar 2019
    @Override
    public String toString() {
        return dag + " " + månedsnavn(måned) + " " + år;
    }

}

public class Oppgave4 {

    public static void main(String[] args) {
        // opprett en ArrayListe og legg to ansatte inn i denne
        List<Ansatt> ansatte = new ArrayList<>();
        ansatte.add(new Ansatt("Jørgen", new Dato(4, 4, 1992), new Dato(24, 7, 2020)));

        Dato født = new Dato(4, 10, 1999);
        Dato tiltrådt = new Dato(24, 3, 2001);
        Ansatt ansatt = new Ansatt("Kari", født, tiltrådt);
        ansatte.add(ansatt);
        // skriv så alt innholdet i arrraylisten ut på system.out.
        for (Ansatt a : ansatte) {
            System.out.println(a);
        }

    }
}
