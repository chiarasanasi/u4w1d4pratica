package Esercizio;

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
            if (persone[i] instanceof Dipendente){
                Dipendente d = (Dipendente) persone[i];
                System.out.println("Dipendente con matricola " + d.getMatricola() + " : "+ ((SalaryEcheckIn) persone[i]).checkIn());
            }else if(persone[i] instanceof Volontario){
                Volontario v = (Volontario) persone[i];
                System.out.println("Volontario " + v.getNome()  + " : " + v.checkIn());

            }


        }
    }
}
