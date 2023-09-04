package org.biglietteria;

import java.math.BigDecimal;

public class Biglietto {

    //ATTRIBUTI

    private int chilometri;
    private int etapasseggero;

    private static final BigDecimal COSTOCHILOMETRICO = new BigDecimal(0.21);

    private static final BigDecimal SCONTOOVER65 = new BigDecimal(0.4);

    private static final BigDecimal SCONTOMINORENNI = new BigDecimal(0.2);


    //COSTRUTTORE

    public Biglietto(int chilometri, int etapasseggero) {
        this.chilometri = chilometri;
        this.etapasseggero = etapasseggero;
    }


//GETTERS E SETTERS

    public int getChilometri() {
        return chilometri;
    }

    public void setChilometri(int chilometri) {
        this.chilometri = chilometri;
    }

    public int getEtapasseggero() {
        return etapasseggero;
    }

    public void setEtapasseggero(int etapasseggero) {
        this.etapasseggero = etapasseggero;
    }


    //METODI


    public BigDecimal calcolaPrezzo() {
        BigDecimal KmBigDecimal = new BigDecimal(chilometri);
        BigDecimal prezzobase= KmBigDecimal.multiply(COSTOCHILOMETRICO);

        if (etapasseggero>65) {
            BigDecimal sconto = prezzobase.multiply(SCONTOOVER65);
            BigDecimal prezzoscontato = prezzobase.subtract(sconto);
            return prezzoscontato;
        } else if ( etapasseggero<18) {
            BigDecimal sconto = prezzobase.multiply(SCONTOMINORENNI);
            BigDecimal prezzoscontato = prezzobase.subtract(sconto);
            return prezzoscontato;
            } else return prezzobase;


        }

    }


