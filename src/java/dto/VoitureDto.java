package dto;

import java.util.Arrays;

public class VoitureDto {

    private String marque;
    private PersonneDto[] prs;

    @Override
    public String toString() {
        return "VoitureDto [marque=" + marque + ", prs=" + Arrays.toString(prs) + "]";
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public PersonneDto[] getPrs() {
        return prs;
    }
    public void setPrs(PersonneDto[] prs) {
        this.prs = prs;
    }
}
