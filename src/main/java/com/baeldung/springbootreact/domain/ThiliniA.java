package com.baeldung.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client-thilini")
public class ThiliniA {

    @Id
    @GeneratedValue
    private Long idNum;

    private String name;
    private String address;

    public ThiliniA() {
    }

    public ThiliniA(String name, String email) {
        this.name = name;
        this.address = email;
    }

    public ThiliniA(Long id, String name, String email) {
        this.idNum = id;
        this.name = name;
        this.address = email;
    }

    public Long getId() {
        return idNum;
    }

    public void setId(Long id) {
        this.idNum = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return address;
    }

    public void setEmail(String email) {
        this.address = email;
    }
}
