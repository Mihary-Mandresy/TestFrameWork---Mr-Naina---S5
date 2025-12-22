package dto;

import java.util.Arrays;

public class PersonneDto {

    private String nom;
    private int age;
    private double[] note;

    @Override
    public String toString() {
        return "PersonneDto [nom=" + nom + ", age=" + age + ", note=" + Arrays.toString(note) + "]";
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

    public double[] getNote() {
        return note;
    }

    public void setNote(double[] note) {
        this.note = note;
    }

}