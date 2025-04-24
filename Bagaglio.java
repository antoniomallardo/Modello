package model;

public class Bagaglio {
    private String codiceBagaglio;
    private StatoBagaglio stato;
    private boolean segnalazioneSmarrimento;
    private Prenotazione prenotazione;

    public Bagaglio() {}

    public Bagaglio(String codiceBagaglio, StatoBagaglio stato, boolean segnalazioneSmarrimento, Prenotazione prenotazione) {
        this.codiceBagaglio = codiceBagaglio;
        this.stato = stato;
        this.segnalazioneSmarrimento = segnalazioneSmarrimento;
        this.prenotazione = prenotazione;
    }
}
