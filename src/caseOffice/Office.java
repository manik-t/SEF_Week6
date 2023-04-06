package caseOffice;

public class Office {
    protected String address;


    public Office(String a) {
        address = a;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
