package dto;

public class PersonneDto {

    private String nom;
    private int age;
    private VoitureDto voiture;

    @Override
    public String toString() {
        return "PersonneDto [nom=" + nom + ", age=" + age + ", voiture=" + voiture + "]";
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

}