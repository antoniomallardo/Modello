package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

public class Volo {
    private String codiceVolo;
    private String compagnia;
    private String aeroportoOrigine;
    private String aeroportoDestinazione;
    private LocalDate data;
    private LocalTime orario;
    private Duration ritardo;
    private StatoVolo stato;
    private Gate gate;

    public Volo() {}

    public Volo(String codiceVolo, String compagnia, String aeroportoOrigine, String aeroportoDestinazione,
                LocalDate data, LocalTime orario, Duration ritardo, StatoVolo stato, Gate gate) {
        this.codiceVolo = codiceVolo;
        this.compagnia = compagnia;
        this.aeroportoOrigine = aeroportoOrigine;
        this.aeroportoDestinazione = aeroportoDestinazione;
        this.data = data;
        this.orario = orario;
        this.ritardo = ritardo;
        this.stato = stato;
        this.gate = gate;
    }
}
