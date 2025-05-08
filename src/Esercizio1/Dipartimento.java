package Esercizio1;

public class Dipartimento {
    private String produzione;
    private String amministrazione;
    private int vendite;

    public Dipartimento(String produzione, String amministrazione, int vendite) {
        this.produzione = produzione;
        this.amministrazione = amministrazione;
        this.vendite = vendite;
    }

    public String getProduzione() {
        return produzione;
    }

    public void setProduzione(String produzione) {
        this.produzione = produzione;
    }

    public String getAmministrazione() {
        return amministrazione;
    }

    public void setAmministrazione(String amministrazione) {
        this.amministrazione = amministrazione;
    }

    public int getVendite() {
        return vendite;
    }

    public void setVendite(int vendite) {
        this.vendite = vendite;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
