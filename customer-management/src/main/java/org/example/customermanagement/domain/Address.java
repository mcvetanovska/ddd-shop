package org.example.customermanagement.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String street;
    private String city;
    private String zip;

    public Address() {}

    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public String format() {
        return street + ", " + city + ", " + zip;
    }

}
