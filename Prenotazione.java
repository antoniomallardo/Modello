package model;

import java.util.List;

public class Prenotazione {
    private int idPrenotazione;
    private String numeroBiglietto;
    private String nomePasseggero;
    private String posto;
    private StatoPrenotazione stato;
    private Utente utente;
    private Volo volo;
    private List<Bagaglio> bagagli;

    public Prenotazione() {}

    public Prenotazione(int idPrenotazione, String numeroBiglietto, String nomePasseggero, String posto,
                        StatoPrenotazione stato, Utente utente, Volo volo, List<Bagaglio> bagagli) {
        this.idPrenotazione = idPrenotazione;
        this.numeroBiglietto = numeroBiglietto;
        this.nomePasseggero = nomePasseggero;
        this.posto = posto;
        this.stato = stato;
        this.utente = utente;
        this.volo = volo;
        this.bagagli = bagagli;
    }
}
