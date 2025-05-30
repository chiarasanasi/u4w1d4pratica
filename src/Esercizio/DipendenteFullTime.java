package Esercizio;

public class DipendenteFullTime extends Dipendente implements SalaryEcheckIn {


    public DipendenteFullTime(String matricola, double stipendio) {
        super(matricola, stipendio);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

    @Override
    public String checkIn() {
        return "Turno di lavoro iniziato";
    }
}
