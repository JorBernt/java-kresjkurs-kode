package com.example.javafxprosjekt;

public abstract class Person {
    private String fornavn;
    private String etternavn;
    private String tlfnr;
    private String addresse;

    public Person(String fornavn, String etternavn, String tlfnr, String addresse) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.tlfnr = tlfnr;
        this.addresse = addresse;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    @Override
    public String toString() {
        return "Fornavn: " + fornavn + "\n" +
                "Etternavn: " + etternavn + "\n" +
                "tlfnr: " + tlfnr + "\n" +
                "addresse: " + fornavn + "\n";
    }
}
