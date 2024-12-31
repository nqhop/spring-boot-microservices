package com.example.demo_feign.response;


import com.example.demo_feign.feignclient.AddressClient;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeResponse {
    private int id;
    private String name;
    private String email;
    private String age;

    private AddressResponse addressResponse;

    @Autowired
    private AddressClient addressClient;

    public EmployeeResponse() {
    }

    public EmployeeResponse(int id, String name, String email, String age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public AddressResponse getAddressResponse() {
        return addressResponse;
    }

    public void setAddressResponse(AddressResponse addressResponse) {
        this.addressResponse = addressResponse;
    }
}
