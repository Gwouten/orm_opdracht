package deloof.wouter.orm_opdracht.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Werknemer {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;
    private String naam;
    private long telefoonnummer;
    private String email;

    public Werknemer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public long getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(long telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
