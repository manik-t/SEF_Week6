package caseOffice;



public class Headquarter extends Office {
    private int importanceLevel;

    public Headquarter(String a, int i) {
        super(a);
        importanceLevel = i;
    }


    public int getImportanceLevel() {
        return importanceLevel;
    }
}
