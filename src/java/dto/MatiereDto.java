package dto;

import java.time.LocalDate;

public class MatiereDto {

    private String nom;
    private int coefficient;
    private LocalDate dateTime = LocalDate.now();

    public MatiereDto(String nom, int coefficient) {
        this.nom = nom;
        this.coefficient = coefficient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

}
