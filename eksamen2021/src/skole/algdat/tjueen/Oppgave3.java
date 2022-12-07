package skole.algdat.tjueen;

//Det er definert to klasser, Fag og Student. Se koden til venstre.
//Lag et program som inneholder disse to klassene og en main-metode.
class Fag{
    private String navn;
    private String år;
    private Student[] studenter;

    //Konstruktør
    public Fag(String navn, String år, Student[] studenter) {
        this.navn = navn;
        this.år = år;
        this.studenter = studenter;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getÅr() {
        return år;
    }

    public void setÅr(String år) {
        this.år = år;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void setStudenter(Student[] studenter) {
        this.studenter = studenter;
    }

    //ToString skal skrive ut følgende:
    //"Fag : Programmering, år : 2020"
    @Override
    public String toString() {
       String ut = "Fag : " + getNavn() + ", år : " + getÅr() + "\n";
       for(Student student : studenter) {
           ut += student.toString() + "\n";
       }
       return ut;
    }
}

class Student{
    private String navn;
    private String studNr;

    //Konstruktør
    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    //toString skal skrive ut følgende:
    //"Student : Navn=Ole Hansen, StudNr=S356734"
    @Override
    public String toString() {
        return "Student : Navn=" + getNavn() + ", StudNr=" + getStudNr();
    }

}


public class Oppgave3 {
    public static void main(String[] args) {
        //Skriv en main-metode for å få det overstående ut via System.out.
        /*
        Fag : Programmering, år : 2020
        Student : Navn=Kari Olsen, StudNr=S234556
        Student : Navn=Ole Hansen, StudNr=S356734
         */

        //Lager et array med studenter som tar programmeringsfaget
        Student[] studenter = new Student[2];
        studenter[0] = new Student("Kari Olsen", "S234556");
        studenter[1] = new Student("Ole Hansen", "S356734");

        Fag programmering = new Fag("Programmering", "2020", studenter);

        System.out.println(programmering);



    }
}
