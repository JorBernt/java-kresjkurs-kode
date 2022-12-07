package com.example.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    List<Double> register = new ArrayList<>();

    @FXML
    private TextField txtTemperatur;

    @FXML
    private Label lblMin;

    @FXML
    private Label lblMaks;

    @FXML
    private Label lblGjennomsnitt;

    @FXML
    private Label lblFeil;

    //Når knappen "Nullstill" trykkes skal alle innslag i arrayet slettes og min, maks og snitt-lablene
    //blankes.
    @FXML
    void nullstill(ActionEvent event) {
        register.clear();
        lblMaks.setText("");
        lblMin.setText("");
        lblFeil.setText("");
    }
    //Når det fylles ut en temperatur i input-boksen og knappen "Registrer" trykkes, skal verdien legges
    //inn i arrayet kalt "registrer".
    @FXML
    void registrer(ActionEvent event) {
        String tempInn = txtTemperatur.getText();
        double temp = 0;
        try {
            temp = Double.parseDouble(tempInn);
        }
        catch (Exception e) {
            lblFeil.setText("Du må skrive inn et gyldig tall!");
            return;
        }
        register.add(temp);
        //Samtidig skal det finnes maks, min og snitt av de verdiene som er lest
        //inn i arryat. Disse verdiene skal så vises i de respektive "labels".
        lblGjennomsnitt.setText(gjennomsnitt());
        lblMaks.setText(max());
        lblMin.setText(min());
    }

    private String min() {
        double min = register.get(0);
        for(double d : register) {
            if(d < min) {
                min = d;
            }
        }
        return String.valueOf(min);
    }

    private String max() {
        double max = register.get(0);
        for(double d : register) {
            if(d > max) {
                max = d;
            }
        }
        return String.valueOf(max);
    }

    private String gjennomsnitt() {
        double sum = 0;
        for(double n : register) {
            sum += n;
        }
        return sum / register.size() + "";
    }
}

/*
Følgende skal implementeres i Controlleren:
Når det fylles ut en temperatur i input-boksen og knappen "Registrer" trykkes, skal verdien legges
inn i arrayet kalt "registrer". Samtidig skal det finnes maks, min og snitt av de verdiene som er lest
inn i arryat. Disse verdiene skal så vises i de respektive "labels".

For å finne min og maks kan det være lurt å sortere arrayet og vise første og siste verdi i arrayet.

Følgende setning kan brukes:
register.sort(Comparator.naturalOrder());

Dersom det ikke skrives inn et tall i input-feltet skal det skrives ut en feilmelding i feilmeldings-
feltet undet registrerings-knappen.

Når knappen "Nullstill" trykkes skal alle innslag i arrayet slettes og min, maks og snitt-lablene
blankes.

 */