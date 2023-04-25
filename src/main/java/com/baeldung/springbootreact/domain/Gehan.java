package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gehan")
public class Gehan {
    @Id
    @GeneratedValue
    private Long id;

    public Gehan() {
    }

    public Gehan(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Gehan(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    private String name;
    private String address;

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

    public void setAddress(String address) {
        this.address = address;
    }


}
