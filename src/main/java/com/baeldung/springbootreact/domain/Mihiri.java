package com.baeldung.springbootreact.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Mihiri {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;



    public Mihiri() {
    }

    public Mihiri(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Mihiri(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String email) {
        this.address = address;
    }
}