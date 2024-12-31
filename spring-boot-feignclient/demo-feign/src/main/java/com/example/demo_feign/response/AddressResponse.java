package com.example.demo_feign.response;

import jakarta.persistence.Column;

public class AddressResponse {
    private int id;
    private String city;
    private String state;

    public AddressResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
