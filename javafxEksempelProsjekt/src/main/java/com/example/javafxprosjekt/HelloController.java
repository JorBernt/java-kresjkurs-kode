package com.example.javafxprosjekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private TextField etternavnTextField;

    @FXML
    private TextField fornavnTextField;

    @FXML
    private TextField tlfnrTextFeild;

    @FXML
    private TextField addresseTextField;

    @FXML
    private RadioButton kundeRadioBtn;

    @FXML
    private RadioButton ansattRadioBtn;

    @FXML
    private TextField ansattNrTextField;

    @FXML
    private TextField fodselnrTextField;

    @FXML
    private Label personListeLabel;

    @FXML
    private Button lagreBtn;

    @FXML
    private Button visKunderBtn;

    @FXML
    private Button visAnsattBtn;

    private List<Person> personer = new ArrayList<>();

    @FXML
    public void lagrePerson(ActionEvent event) {
        String fornavn = fornavnTextField.getText();
        String etternavn = etternavnTextField.getText();
        String tlfnr = tlfnrTextFeild.getText();
        String addresse = addresseTextField.getText();

        if(kundeRadioBtn.isSelected()) {
            Kunde kunde = new Kunde(fornavn, etternavn, tlfnr, addresse);
            personer.add(kunde);
        }
        else {
            int ansattNr = Integer.parseInt(ansattNrTextField.getText());
            String fødselNr = fodselnrTextField.getText();
            Ansatt ansatt = new Ansatt(fornavn, etternavn, tlfnr, addresse, ansattNr, fødselNr);
            personer.add(ansatt);
        }

    }

    @FXML
    public void visAnsatt(ActionEvent event) {
        String ut = "";
        for(int i = 0; i < personer.size(); i++) {
            System.out.println(personer.get(i).toString());
        }
        int[] tall = {4,2,3,5,6,2,3};
        for(int n : tall) {
            System.out.println(n);
        }
        for(int i = 0; i <= tall.length; i++) {
            System.out.println(tall[i]);
        }
        for(Person person : personer) {
            System.out.println(person.toString());
        }


        for(Person person : personer) {
            if(person instanceof Ansatt) {
                ut += person.toString() + "\n";
            }
        }
        personListeLabel.setText(ut);
    }

    @FXML
    public void visKunde(ActionEvent event) {

    }
}