package Esercizio1;

public class Dipendente extends Dipartimento {
    private String matricola;
    private double stipendio;

    public Dipendente(String matricola, double stipendio) {
        super("prod 1", "amm1", 10);
        this.matricola = matricola;
        this.stipendio = stipendio;
    }

    public String getMatricola() {
        return matricola;
    }


    public double getStipendio() {
        return stipendio;
    }



}
