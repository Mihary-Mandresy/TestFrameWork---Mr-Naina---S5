package dto;

import java.util.Arrays;

public class VoitureDto {
    private String nom;
    private String marque;
    private int[] tab;

    @Override
    public String toString() {
        return "VoitureDto [nom=" + nom + ", marque=" + marque + ", tab=" + Arrays.toString(tab) + "]";
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

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

}
