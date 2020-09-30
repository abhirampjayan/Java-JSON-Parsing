package org.example;

public class Address {
    private String place;
    private String city;
    private int zipcode;

    @Override
    public String toString() {
        return "\n"+ getPlace()+", \n"+getCity() +", \n"+getZipcode();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
