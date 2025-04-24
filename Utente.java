package model;

public class Utente {
    private int idUtente;
    private String nome;
    private String email;
    private String password;
    private Ruolo ruolo;

    public Utente() {}

    public Utente(int idUtente, String nome, String email, String password, Ruolo ruolo) {
        this.idUtente = idUtente;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.ruolo = ruolo;
    }
}
