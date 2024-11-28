package com.firstpringapp.First_SpringBoot_App.model;

public class Addresss {
    private int doorNo;
    private String streetName;
    private String city;

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Addresss{" +
                "doorNo=" + doorNo +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
