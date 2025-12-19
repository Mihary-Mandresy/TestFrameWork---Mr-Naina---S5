package dto;

import java.util.Arrays;

public class PersonneDto {

    private String nom;
    private int age;
    private VoitureDto voiture;
    private String[] nickName;
    private double[] note;

    @Override
    public String toString() {
        return "PersonneDto [nom=" + nom + ", age=" + age + ", voiture=" + voiture + ", nickName="
                + Arrays.toString(nickName) + ", note=" + Arrays.toString(note) + "]";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public VoitureDto getVoiture() {
        return voiture;
    }

    public void setVoiture(VoitureDto voiture) {
        this.voiture = voiture;
    }

    public String[] getNickName() {
        return nickName;
    }

    public void setNickName(String[] nickName) {
        this.nickName = nickName;
    }

    public double[] getNote() {
        return note;
    }

    public void setNote(double[] note) {
        this.note = note;
    }
}