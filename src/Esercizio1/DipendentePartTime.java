package Esercizio1;

public class DipendentePartTime extends Dipendente implements SalaryEcheckIn {

    public DipendentePartTime(String matricola, double stipendio) {
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
