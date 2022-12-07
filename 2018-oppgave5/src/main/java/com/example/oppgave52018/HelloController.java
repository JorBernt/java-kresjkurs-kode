package personregister;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

class Person{
    // attributtene til klassen
    private String navn, personnr;

    // konstruktør for å initialisere attributtene til klassen


    public Person(String navn, String personnr) {
        this.navn = navn;
        this.personnr = personnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getPersonnr() {
        return personnr;
    }

    public void setPersonnr(String personnr) {
        this.personnr = personnr;
    }

    @Override
    public String toString() {
        return "Personnummer: " + personnr + " Navn: " + navn;
    }
}

class Register{
    List<Person> personer = new ArrayList<>();

    public void registrerPerson(String navn, String personnummer){
        /* sjekk om personnummeret finnes fra før
           dersom det ikke gjør det registrer det */
        if(!finnesFraFør(personnummer)) {
            personer.add(new Person(navn, personnummer));
        }

    }

    public void slettPerson(String personnummer){
        /* løp igjennom arrayet for å finne personen,
           dersom den finnes, slett den */
        for(Person person : personer) {
            if(person.getPersonnr().equals(personnummer)) {
                personer.remove(person);
                return;
            }
        }
    }

    public boolean finnesFraFør(String personnummer){
        /* sjekk om personnummeret allerede ligger i arrayet
           dersom det gjør det returner true, ellers false */
        for(Person person : personer) {
            if(person.getPersonnr().equals(personnummer)) {
                return true;
            }
        }
        return false;
    }

    public String visAllePersonene(){
        /* løp igjennom arrayet og formater først personnummer så navn på
           hver sin linje i en streng og returner denne. */
        String ut = "";
        for(Person person : personer) {
            ut += person.toString() + "\n";
        }
        return ut;
    }
}

public class HelloController {
    Register register = new Register();

    @FXML
    private Label lblRegister;

    @FXML
    private TextField txtnavn;

    @FXML
    private TextField txtPersonnummer;

    @FXML
    void registrer(ActionEvent event) {
        String navn = txtnavn.getText();
        String personnr = txtPersonnummer.getText();
        register.registrerPerson(navn, personnr);
    }

    @FXML
    void slett(ActionEvent event) {
        String personnr = txtPersonnummer.getText();
        register.slettPerson(personnr);
    }
}