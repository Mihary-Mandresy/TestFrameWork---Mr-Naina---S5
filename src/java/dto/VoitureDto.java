package dto;

public class VoitureDto {
    private String nom;
    private String marque;

    @Override
    public String toString() {
        return "VoitureDto [nom=" + nom + ", marque=" + marque + "]";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

}
