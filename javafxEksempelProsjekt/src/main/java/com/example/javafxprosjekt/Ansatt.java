package com.example.javafxprosjekt;

import java.util.PrimitiveIterator;

public class Ansatt extends Person{
    private int ansattNr;
    private String fødselsNr;

    public Ansatt(String fornavn, String etternavn, String tlfnr, String addresse, int ansattNr, String fødselsNr) {
        super(fornavn, etternavn, tlfnr, addresse);
        this.ansattNr = ansattNr;
        this.fødselsNr = fødselsNr;
    }

    public int getAnsattNr() {
        return ansattNr;
    }

    public void setAnsattNr(int ansattNr) {
        this.ansattNr = ansattNr;
    }

    public String getFødselsNr() {
        return fødselsNr;
    }

    public void setFødselsNr(String fødselsNr) {
        this.fødselsNr = fødselsNr;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Ansattnr: " +  ansattNr + "\n" +
                "Fødselsnur: " + fødselsNr;
    }
}
