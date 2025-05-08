package Esercizio1;

public class MainEsercizio1 {
    public static void main(String[] args) {
        SalaryEcheckIn[] persone = new SalaryEcheckIn[4];

        persone[0] = new DipendenteFullTime("0001", 1500);
        persone[1] = new DipendentePartTime("0002", 800);
        persone[2] = new Dirigente("0003", 11300);
        persone[3] = new Volontario("Mario Rossi",20, "Animatore" );

        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = (Dipendente) persone[0];
        dipendenti[1] = (Dipendente) persone[1];
        dipendenti[2] = (Dipendente) persone[2];



        double totaleStipendi = 0 ;

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Matricola Dipendente : " + dipendenti[i].getMatricola());
            double stipendio = ((SalaryEcheckIn) dipendenti[i]).calculateSalary();
            System.out.println(stipendio);

            totaleStipendi += stipendio;
        }
        System.out.println("Totale stipendi : "+totaleStipendi);

        for (int i = 0; i < persone.length; i++) {
            System.out.println("CheckIn --> " + persone[i].checkIn());

        }
    }
}
