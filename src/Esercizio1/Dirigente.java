package Esercizio1;

public class Dirigente extends Dipendente implements SalaryEcheckIn {

    public Dirigente(String matricola, double stipendio) {
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
