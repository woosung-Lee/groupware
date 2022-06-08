package me.ws.groupware.domain;

import lombok.Getter;

@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    public Address(String city, String street, String zipcopde ) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcopde;
    }

}
